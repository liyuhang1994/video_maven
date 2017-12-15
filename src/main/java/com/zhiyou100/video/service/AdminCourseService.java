package com.zhiyou100.video.service;

import java.util.List;

import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.model.Subject;
import com.zhiyou100.video.utils.Page;

public interface AdminCourseService {

	Page<Course> findAllCourse(String currentPage);

	List<Subject> findAllSubject();

	void AddCourse(Course c);

	Course findCourseById(int id);

	String findSubNameById(Integer subject_id);

	void updateCourseById(Course c);

	void deleteCourseById(Integer id);

}
