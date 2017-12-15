package com.zhiyou100.video.web.controller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zhiyou100.video.model.Email;
import com.zhiyou100.video.model.Result;
import com.zhiyou100.video.model.User;
import com.zhiyou100.video.service.FrontUserService;
import com.zhiyou100.video.utils.MD5Utils;
import com.zhiyou100.video.utils.MailUtil;

@Controller
@RequestMapping("front/user/")
public class FrontUserController {

	@Autowired
	private FrontUserService fus;

	// 跳转到后台登录页面
	@RequestMapping("toAdmin.action")
	public String toAdmin() {
		return "forward:/WEB-INF/view/admin/login.jsp";
	}

	// 注册前台用户
	@RequestMapping("userRegister.action")
	@ResponseBody
	public Result userRegister(User u) {
		Result re = new Result();
		List<User> user = fus.findUserByUser(u);
		if (!user.isEmpty()) {
			re.setMessage("该用户已注册");
			re.setSuccess(false);
			return re;
		} else {
			int num = (int) ((Math.random()*9+1)*10000);  
			String str = num+"";
			u.setInsert_time(new Date());
			u.setUpdate_time(new Date());
			u.setCaptcha(str);
			u.setPassword(MD5Utils.md5(u.getPassword()));
			fus.addUser(u);
			re.setSuccess(true);
			return re;
		}
	}

	// 登录
	@RequestMapping("userLogin.action")
	@ResponseBody
	public Result userLogin(User u, HttpSession session) {
		Result re = new Result();
		u.setPassword(MD5Utils.md5(u.getPassword()));
		List<User> user = fus.findUserByUser(u);
		if (user.isEmpty()) {
			re.setMessage("该用户未注册");
			re.setSuccess(false);
			return re;
		} else {
			session.setAttribute("_front_user", user.get(0));
			re.setSuccess(true);
			return re;
		}
	}

	// 显示个人信息
	@RequestMapping("userIndex.action")
	public String userIndex(HttpSession session, Model m) {
		User u = (User) session.getAttribute("_front_user");
		List<User> user = fus.findUserByUser(u);
		m.addAttribute("user", user.get(0));
		return "/front/user/index";
	}

	// 跳转到修改个人信息
	@RequestMapping(value = "userProfileTZ.action", method = RequestMethod.GET)
	public String userProfileTZ(Model m, HttpSession session) {
		User u = fus.findUserById(((User) session.getAttribute("_front_user")).getId());
		m.addAttribute("user", u);
		return "/front/user/profile";
	}

	// 修改个人信息
	@RequestMapping(value = "userProfile.action", method = RequestMethod.POST)
	public String userProfile(User u, HttpSession session) {
		u.setId(((User) session.getAttribute("_front_user")).getId());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = sdf.parse(u.getBirthdayStr());
			u.setBirthday(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		u.setUpdate_time(new Date());
		fus.updateUser(u);
		return "forward:/front/user/userIndex.action";
	}

	// 跳转到修改密码安全页面
	@RequestMapping(value = "userPassword.action", method = RequestMethod.GET)
	public String userPasswordTZ(HttpSession session, Model m) {
		User u = fus.findUserById(((User) session.getAttribute("_front_user")).getId());
		m.addAttribute("user", u);
		return "/front/user/password";
	}

	// 修改密码
	@RequestMapping(value = "userPassword.action", method = RequestMethod.POST)
	public String userPassword(String oldPassword, String newPassword, HttpSession session, Model m) {
		User u = fus.findUserById(((User) session.getAttribute("_front_user")).getId());
		if (MD5Utils.md5(oldPassword).equals(u.getPassword())) {
			u.setPassword(MD5Utils.md5(newPassword));
			u.setUpdate_time(new Date());
			fus.updateUser(u);
			session.setAttribute("_front_user", u);
			m.addAttribute("message", "密码修改成功");
		} else {
			m.addAttribute("message", "密码不正确");
		}
		return "/front/user/password";
	}

	// 跳转到修改头像页面
	@RequestMapping(value = "userAvatar.action", method = RequestMethod.GET)
	public String userAvatarTZ(HttpSession session, Model m) {
		User u = fus.findUserById(((User) session.getAttribute("_front_user")).getId());
		m.addAttribute("user", u);
		return "/front/user/avatar";
	}

	// 修改头像
	@RequestMapping(value = "userAvatar.action", method = RequestMethod.POST)
	public String userAvatar(MultipartFile image_file, Model m,HttpSession session) throws Exception {

		if(!image_file.getOriginalFilename().equals("")){
		
		// 生成随机文件名
		String st = UUID.randomUUID().toString().replaceAll("-", "");
		// 得到文件扩展名
		String ext = FilenameUtils.getExtension(image_file.getOriginalFilename());
		// 得到文件全名
		String fileName = st + "." + ext;
		image_file.transferTo(new File("D:/video-pic/" + fileName));
		 
		User u = fus.findUserById(((User) session.getAttribute("_front_user")).getId());
		u.setId(((User) session.getAttribute("_front_user")).getId());
		u.setHead_url("upload/" + fileName);
		fus.updateUser(u);
		session.setAttribute("_front_user", u);
		}
		return "forward:/front/user/userIndex.action";
	}
	
	// 跳转到首页
	@RequestMapping("index.action")
	public String index(){
		return "forward:/index.jsp";
	}
	
	// 退出登录
	@RequestMapping("userLogout.action")
	public String userLogout(HttpSession session){
		session.removeAttribute("_front_user");
		return "redirect:/front/user/index.action";
	}
	
	// 点击忘记密码
	@RequestMapping(value="forgetpwd.action",method=RequestMethod.GET)
	public String forgetpwdTZ(){
		return "/front/user/forget_pwd";
	}
	
	// 发送验证码
	@RequestMapping("sendemail.action")
	@ResponseBody
	public Result sendCaptcha(String email) throws Exception{
		Result r = new Result();
		User u = fus.findUserByEmail(email);
		if(u==null){
			r.setSuccess(false);
			r.setMessage("用户不存在");
		}else{
			r.setSuccess(true);
			String captcha = u.getCaptcha();
			MailUtil.send(email, "验证信息", captcha);
		}
		
		return r;
	}
	
	// 邮箱验证完成,跳转到重置密码
	@RequestMapping(value="forgetpwd.action",method=RequestMethod.POST)
	public String forgetpwd(String email,String captcha,Model m){
		/*User u = fus.findUserByEmail(email);
		if(u.getCaptcha().equals(captcha)){
			return "/front/user/reset_pwd";
		}*/
		
		m.addAttribute("email", email);
		m.addAttribute("captcha", captcha);
		
		return "/front/user/reset_pwd";
	}
	
	@RequestMapping(value="resetpwd.action",method=RequestMethod.POST)
	public String resetpwd(String email,String captcha,Model m,String password){
		int num = (int) ((Math.random()*9+1)*10000);  
		String str = num+"";
		User u = fus.findUserByEmail(email);
		if(u.getCaptcha().equals(captcha)){
			u.setPassword(MD5Utils.md5(password));
			u.setUpdate_time(new Date());
			u.setCaptcha(str);
			
			fus.updateUser(u);
		}
		
		return "redirect:/front/user/index.action";
	}
	
	
	
}
