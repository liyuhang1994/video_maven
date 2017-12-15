package com.zhiyou100.video.web.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.model.Speaker;
import com.zhiyou100.video.model.Video;
import com.zhiyou100.video.service.AdminVideoService;
import com.zhiyou100.video.utils.Page;

@Controller
@RequestMapping("admin/video/")
public class AdminVideoController {

	@Autowired
	private AdminVideoService avs;

	// 视频展示列表
	@RequestMapping("videoList.action")
	public String videoList(Model m, HttpServletRequest req) {

		String videoName = req.getParameter("videoName");
		String speakerName = req.getParameter("speakerName");
		String courseName = req.getParameter("courseName");
		String currentPage = req.getParameter("page");

		videoName = videoName == null ? "" : videoName;
		speakerName = (speakerName == null || speakerName.equals("请选择主讲人")) ? "" : speakerName;
		courseName = (courseName == null || courseName.equals("请选择课程")) ? "" : courseName;
		currentPage = currentPage == null ? "1" : currentPage;

		// System.out.println("videoName:"+videoName+"-----speakerName:"+speakerName+"------courseName:"+courseName);

		Page<Video> page = avs.findAllVideo(videoName, speakerName, courseName, currentPage);

		List<Speaker> sp = avs.findAllSpeaker();
		List<Course> co = avs.findAllCourse();

		m.addAttribute("videoName", videoName);
		m.addAttribute("speakerName", speakerName);
		m.addAttribute("courseName", courseName);
		m.addAttribute("page", page);

		m.addAttribute("sp", sp);
		m.addAttribute("co", co);

		return "/admin/video/videoList";
	}

	// 跳转到添加视频
	@RequestMapping("videoAddTZ.action")
	public String videoAddTZ(Model m) {
		List<Speaker> sp = avs.findAllSpeaker();
		List<Course> co = avs.findAllCourse();
		m.addAttribute("sp", sp);
		m.addAttribute("co", co);
		return "/admin/video/videoAdd";
	}

	// 添加视频,完成后跳转到展示列表
	@RequestMapping("videoAdd.action")
	public String videoAdd(Video v) {
		v.setInsert_time(new Date());
		v.setUpdate_time(new Date());
		avs.addVideo(v);
		return "forward:/admin/video/videoList.action";
	}

	// 跳转到编辑视频
	@RequestMapping("videoEditTZ.action")
	public String videoEditTZ(Model m, Integer id) {
		List<Speaker> sp = avs.findAllSpeaker();
		List<Course> co = avs.findAllCourse();
		Video v = avs.findVideoById(id);
		String speakerName = avs.findSpeakerNameById(v.getSpeaker_id());
		String courseName = avs.findCourseNameById(v.getCourse_id());
		v.setSpeaker_name(speakerName);
		v.setCourse_name(courseName);
		m.addAttribute("sp", sp);
		m.addAttribute("co", co);
		m.addAttribute("video", v);
		return "/admin/video/videoEdit";
	}

	// 编辑视频,完成后跳转到展示列表
	@RequestMapping("videoEdit.action")
	public String videoEdit(Video v, Integer id) {
		v.setUpdate_time(new Date());
		v.setId(id);
		avs.updateVideo(v);
		return "forward:/admin/video/videoList.action";
	}

	// 删除视频
	@RequestMapping("videoDelete.action")
	public String videoDelete(Integer id) {
		avs.deleteVideoById(id);
		return "forward:/admin/video/videoList.action";
	}

	@RequestMapping("videoDeleteAll.action")
	public String videoDeleteAll(Integer[] id) {
		if (id != null) {

			for (int i : id) {
				avs.deleteVideoById(i);
			}
		}

		// System.out.println(Arrays.toString(id));
		return "forward:/admin/video/videoList.action";
	}
}
