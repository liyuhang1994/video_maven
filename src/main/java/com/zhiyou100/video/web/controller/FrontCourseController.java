package com.zhiyou100.video.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.model.Subject;
import com.zhiyou100.video.service.FrontCourseService;

@Controller
@RequestMapping("front/course/")
public class FrontCourseController {

	@Autowired
	private FrontCourseService fcs;
	
	// 跳转到课程展示页面
	@RequestMapping("courseIndex.action")
	public String courseIndex(Integer subjectId,Model m){
		
		List<Course> li = fcs.findCourseBySub(subjectId);
		Subject s = fcs.findSubjectById(subjectId);
		m.addAttribute("courses", li);
		m.addAttribute("subjectId", subjectId);
		m.addAttribute("subject", s);
		return "/front/course/index";
	}
	
}
