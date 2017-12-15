package com.zhiyou100.video.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.video.mapper.CourseMapper;
import com.zhiyou100.video.mapper.SpeakerMapper;
import com.zhiyou100.video.mapper.VideoMapper;
import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.model.Speaker;
import com.zhiyou100.video.model.Video;
import com.zhiyou100.video.service.AdminVideoService;
import com.zhiyou100.video.utils.Page;

@Service
public class AdminVideoServiceImpl implements AdminVideoService{

	@Autowired
	private VideoMapper vm;
	@Autowired
	private SpeakerMapper sm;
	@Autowired
	private CourseMapper cm;
	
	@Override
	public List<Speaker> findAllSpeaker() {
		List<Speaker> list = sm.selectByExample(null);
		return list;
	}

	@Override
	public List<Course> findAllCourse() {
		List<Course> list = cm.selectByExample(null);
		return list;
	}

	@Override
	public Page<Video> findAllVideo(String videoName, String speakerName, String courseName, String currentPage) {
		
		int count = vm.getAllVideoCountBySearch(videoName,speakerName,courseName);
		List<Video> list = vm.findAllVideoByLimit(videoName,speakerName,courseName,(Integer.parseInt(currentPage)-1)*5);
		Page<Video> page = new Page<>();
		page.setTotal(count);
		page.setPage(Integer.parseInt(currentPage));
		page.setSize(5);
		page.setRows(list);
		return page;
		
	}

	@Override
	public void addVideo(Video v) {
		vm.insertSelective(v);
	}

	@Override
	public Video findVideoById(Integer id) {
		return vm.selectByPrimaryKey(id);
	}

	@Override
	public void updateVideo(Video v) {
		vm.updateByPrimaryKeySelective(v);
	}

	@Override
	public String findSpeakerNameById(Integer speaker_id) {
		return sm.selectByPrimaryKey(speaker_id).getSpeaker_name();
	}

	@Override
	public String findCourseNameById(Integer course_id) {
		return cm.selectByPrimaryKey(course_id).getCourse_name();
	}

	@Override
	public void deleteVideoById(Integer id) {
		vm.deleteByPrimaryKey(id);
	}

}
