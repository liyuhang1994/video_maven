package com.zhiyou100.video.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.video.model.Speaker;
import com.zhiyou100.video.service.AdminSpeakerService;
import com.zhiyou100.video.utils.Page;

@Controller
@RequestMapping("admin/speaker/")
public class AdminSpeakerController {

	@Autowired
	private AdminSpeakerService ass;
	
	// 主讲人展示列表
	@RequestMapping("speakerList.action")
	public String speakerList(HttpServletRequest req,Model m){
		//TODO 改为Springmvc默认参数的形式
		String speakerName = req.getParameter("speakerName");
		String speakerJob = req.getParameter("speakerJob");
		String currentPage = req.getParameter("page");
		speakerName = speakerName==null?"":speakerName;
		speakerJob = speakerJob==null?"":speakerJob;
		currentPage = currentPage==null?"1":currentPage;
		Page<Speaker> page = ass.findAllSpeaker(speakerName,speakerJob,currentPage);
		m.addAttribute("speakerName", speakerName);
		m.addAttribute("speakerJob", speakerJob);
		m.addAttribute("page", page);
		return "/admin/speaker/speakerList";
	}
	
	// 跳转到添加主讲人
	@RequestMapping("speakerAddTZ.action")
	public String speakerAddTZ(){
		return "/admin/speaker/speakerAdd";
	}
	
	// 添加主讲人,完成后跳转到展示列表
	@RequestMapping("speakerAdd.action")
	public String speakerAdd(Speaker s){
		s.setInsert_time(new Date());
		s.setUpdate_time(new Date());
		ass.AddSpeaker(s);
		return "forward:/admin/speaker/speakerList.action";
	}
	
	// 跳转到编辑主讲人
	@RequestMapping("speakerEditTZ.action")
	public String speakerEditTZ(Integer id,Model m){
		Speaker s = ass.findSpeakerById(id);
		m.addAttribute("speaker", s);
		return "/admin/speaker/speakerEdit";
	}
	
	// 编辑主讲人,完成后跳转到展示列表
	@RequestMapping("speakerEdit.action")
	public String speakerEdit(Speaker s,Integer id){
		s.setId(id);
		s.setUpdate_time(new Date());
		ass.updateSpeakerById(s);
		return "forward:/admin/speaker/speakerList.action";
	}
	
	// 删除主讲人
	@RequestMapping("speakerDelete.action")
	public String speakerDelete(Integer id){
		ass.deleteSpeakerById(id);
		return "forward:/admin/speaker/speakerList.action";
	}
	
	
}
