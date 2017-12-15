package com.zhiyou100.video.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.model.Speaker;
import com.zhiyou100.video.model.Subject;
import com.zhiyou100.video.model.Video;
import com.zhiyou100.video.service.FrontVideoService;

@Controller
@RequestMapping("front/video/")
public class FrontVideoController {

	@Autowired
	private FrontVideoService fvs;

	@RequestMapping("videoIndex.action")
	public String videoIndex(Integer videoId, Integer subjectId, Model m) {

		Video v = fvs.findVideoById(videoId);
		fvs.updateVideoPlayTimes(videoId);
		Course c = fvs.findCourseById(v.getCourse_id());
		Speaker s = fvs.findSpeakerById(v.getSpeaker_id());
		List<Video> li = fvs.findVideoByCId(c.getId());
		Subject sub = fvs.findSubjectById(subjectId);
		
		m.addAttribute("video", v);
		m.addAttribute("speaker", s);
		m.addAttribute("course", c);
		m.addAttribute("videoList", li);
		m.addAttribute("subject", sub);

		m.addAttribute("subjectId", subjectId);
		m.addAttribute("videoId", videoId);
		return "/front/video/index";
	}
}
