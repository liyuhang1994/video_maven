package com.zhiyou100.video.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.video.mapper.CourseMapper;
import com.zhiyou100.video.mapper.SubjectMapper;
import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.model.Subject;
import com.zhiyou100.video.service.AdminCourseService;
import com.zhiyou100.video.utils.Page;

@Service
public class AdminCourseServiceImpl implements AdminCourseService{

	@Autowired
	private CourseMapper am;
	
	@Autowired
	private SubjectMapper sm;
	
	@Override
	public Page<Course> findAllCourse(String currentPage) {
		int count = am.countByExample(null);
		List<Course> list = am.findCourseByLimit((Integer.parseInt(currentPage)-1)*5);
		Page<Course> page = new Page<>();
		page.setTotal(count);
		page.setPage(Integer.parseInt(currentPage));
		page.setSize(5);
		page.setRows(list);
		return page;
	}

	@Override
	public List<Subject> findAllSubject() {
		return sm.selectByExample(null);
	}

	@Override
	public void AddCourse(Course c) {
		am.insertSelective(c);
	}

	@Override
	public Course findCourseById(int id) {
		return am.selectByPrimaryKey(id);
	}

	@Override
	public String findSubNameById(Integer subject_id) {
		return sm.selectByPrimaryKey(subject_id).getSubject_name();
	}

	@Override
	public void updateCourseById(Course c) {
		am.updateByPrimaryKeySelective(c);
	}

	@Override
	public void deleteCourseById(Integer id) {
		am.deleteByPrimaryKey(id);
	}

}
