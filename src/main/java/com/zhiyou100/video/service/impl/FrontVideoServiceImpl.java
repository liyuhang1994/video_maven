package com.zhiyou100.video.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.video.mapper.CourseMapper;
import com.zhiyou100.video.mapper.SpeakerMapper;
import com.zhiyou100.video.mapper.SubjectMapper;
import com.zhiyou100.video.mapper.VideoMapper;
import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.model.Speaker;
import com.zhiyou100.video.model.Subject;
import com.zhiyou100.video.model.Video;
import com.zhiyou100.video.model.VideoExample;
import com.zhiyou100.video.service.FrontVideoService;
import com.zhiyou100.video.utils.SecondFormat;

@Service
public class FrontVideoServiceImpl implements FrontVideoService {

	@Autowired
	private VideoMapper vm;
	
	@Autowired
	private CourseMapper cm;
	
	@Autowired
	private SpeakerMapper sm;
	
	@Autowired
	private SubjectMapper sum;
	
	@Override
	public Video findVideoById(Integer videoId) {
		return vm.selectByPrimaryKey(videoId);
	}

	@Override
	public Course findCourseById(Integer course_id) {
		return cm.selectByPrimaryKey(course_id);
	}

	@Override
	public Speaker findSpeakerById(Integer speaker_id) {
		return sm.selectByPrimaryKey(speaker_id);
	}

	@Override
	public List<Video> findVideoByCId(Integer id) {
		VideoExample ve = new VideoExample();
		ve.createCriteria().andCourse_idEqualTo(id);
		List<Video> li = vm.selectByExample(ve);
		for (Video video : li) {
			video.setVideoLength(SecondFormat.secondFormat(video.getVideo_length()));
		}
		return li;
	}

	@Override
	public void updateVideoPlayTimes(Integer videoId) {
		vm.updateVideoPlayTimes(videoId);
		
	}

	@Override
	public Subject findSubjectById(Integer subjectId) {
		
		return sum.selectByPrimaryKey(subjectId);
	}

}
