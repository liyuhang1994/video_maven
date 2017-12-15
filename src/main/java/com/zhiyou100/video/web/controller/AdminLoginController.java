package com.zhiyou100.video.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyou100.video.model.Admin;
import com.zhiyou100.video.service.AdminLoginService;
import com.zhiyou100.video.utils.MD5Utils;

@Controller
@RequestMapping("admin/")
public class AdminLoginController {

	@Autowired
	private AdminLoginService als;

	@RequestMapping("adminLogin.action")
	public String tzAdminLogin() {
		return "forward:/WEB-INF/view/admin/login.jsp";
	}

	@RequestMapping("adminUserLogin.action")
	public String adminLogin(Admin adm,HttpSession session,Model m) {
		adm.setLogin_pwd(MD5Utils.md5(adm.getLogin_pwd()));
		Admin a = als.findAdminByPwd(adm);
		if (a!=null) {
			session.setAttribute("LOGIN", a);
			return "forward:/WEB-INF/view/admin/admin.jsp";
		}else{
			m.addAttribute("err", "登录失败");
			return "forward:/WEB-INF/view/admin/login.jsp";
		}
	}

	@RequestMapping("adminLogOut.action")
	public String adminLogOut(){
		return "forward:/WEB-INF/view/admin/login.jsp";
	}
	
	@RequestMapping("adminUserLoginIsExit.action")
	@ResponseBody
	public String adminUserLoginIsExit(String login_name){
		Admin a = als.findAdminByName(login_name);
		if(a!=null){
			return "success";
		}
		return "fail";
	}
}
