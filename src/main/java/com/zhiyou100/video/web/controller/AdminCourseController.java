package com.zhiyou100.video.web.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.model.Subject;
import com.zhiyou100.video.service.AdminCourseService;
import com.zhiyou100.video.utils.Page;

@Controller
@RequestMapping("admin/course/")
public class AdminCourseController {

	@Autowired
	private AdminCourseService acs;
	
	
	// 课程展示列表
	@RequestMapping("courseList.action")
	public String courseList(Model m,HttpServletRequest req){
		String currentPage = req.getParameter("page");
		currentPage = currentPage==null?"1":currentPage;
		Page<Course> page = acs.findAllCourse(currentPage);
		m.addAttribute("page", page);
		return "/admin/course/courseList";
	}
	
	// 跳转到添加课程
	@RequestMapping("courseAddTZ.action")
	public String courseAddTZ(Model m){
		List<Subject> list = acs.findAllSubject();
		m.addAttribute("sub", list);
		return "/admin/course/courseAdd";
	}
	
	// 添加课程,添加完跳转到展示列表
	@RequestMapping("courseAdd.action")
	public String courseAdd(Course c){
		c.setInsert_time(new Date());
		c.setUpdate_time(new Date());
		acs.AddCourse(c);
		return "forward:/admin/course/courseList.action";
	}
	
	// 跳转到编辑课程
	@RequestMapping("courseEditTZ.action")
	public String courseEditTZ(Model m,int id){
		Course c = acs.findCourseById(id);
		c.setId(id);
		List<Subject> list = acs.findAllSubject();
		String subjece_name = acs.findSubNameById(c.getSubject_id());
		c.setSubject_name(subjece_name);
		m.addAttribute("sub", list);
		m.addAttribute("course", c);
		return "/admin/course/courseEdit";
	}
	
	// 编辑课程,跳转到展示列表
	@RequestMapping("courseEdit.action")
	public String courseEdit(Course c,Integer id){
		c.setUpdate_time(new Date());
		c.setId(id);
		acs.updateCourseById(c);
		return "forward:/admin/course/courseList.action";
	}
	
	// 删除课程,完成后跳转到展示列表
	@RequestMapping("courseDelete.action")
	public String courseDelete(Integer id){
		acs.deleteCourseById(id);
		return "forward:/admin/course/courseList.action";
	}
	
	
}
