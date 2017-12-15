package com.zhiyou100.video.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.service.AdminStatisticsService;

@Controller
@RequestMapping("admin/statistics")
public class AdminStatisticsController {

	@Autowired
	private AdminStatisticsService ass;
	
	@RequestMapping("statisticsList.action")
	public String statisticsList(Model m){
		
		List<Course> list = ass.findAllCourse();
		
		m.addAttribute("list", list);
		
		return "/admin/statistics/statisticsList";
	}
}
