package com.zhiyou100.video.service;

import java.util.List;

import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.model.Subject;

public interface FrontCourseService {

	List<Course> findCourseBySub(Integer subjectId);

	Subject findSubjectById(Integer subjectId);

}
