package com.zhiyou100.video.service;

import java.util.List;

import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.model.Speaker;
import com.zhiyou100.video.model.Video;
import com.zhiyou100.video.utils.Page;

public interface AdminVideoService {

	List<Speaker> findAllSpeaker();

	List<Course> findAllCourse();

	Page<Video> findAllVideo(String videoName, String speakerName, String courseName, String currentPage);

	void addVideo(Video v);

	Video findVideoById(Integer id);

	void updateVideo(Video v);

	String findSpeakerNameById(Integer speaker_id);

	String findCourseNameById(Integer course_id);

	void deleteVideoById(Integer id);

}
