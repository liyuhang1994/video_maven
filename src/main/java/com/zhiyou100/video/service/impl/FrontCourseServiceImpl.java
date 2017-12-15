package com.zhiyou100.video.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.video.mapper.CourseMapper;
import com.zhiyou100.video.mapper.SubjectMapper;
import com.zhiyou100.video.mapper.VideoMapper;
import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.model.CourseExample;
import com.zhiyou100.video.model.Subject;
import com.zhiyou100.video.model.Video;
import com.zhiyou100.video.model.VideoExample;
import com.zhiyou100.video.service.FrontCourseService;
import com.zhiyou100.video.utils.SecondFormat;

@Service
public class FrontCourseServiceImpl implements FrontCourseService {

	@Autowired
	private CourseMapper cm;
	@Autowired
	private VideoMapper vm;
	@Autowired
	private SubjectMapper sm;
	
	@Override
	public List<Course> findCourseBySub(Integer subjectId) {
		CourseExample ce = new CourseExample();
		ce.createCriteria().andSubject_idEqualTo(subjectId);
		List<Course> list = cm.selectByExample(ce);
		for (Course course : list) {
			VideoExample ve = new VideoExample();
			ve.createCriteria().andCourse_idEqualTo(course.getId());
			List<Video> v = vm.selectByExample(ve);
			for (Video video : v) {
				video.setVideoLength(SecondFormat.secondFormat(video.getVideo_length()));
			}
			course.setVideoList(v);
		}
		return list;
	}

	@Override
	public Subject findSubjectById(Integer subjectId) {
		
		return sm.selectByPrimaryKey(subjectId);
	}

}
