package com.zhiyou100.video.service;

import java.util.List;

import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.model.Speaker;
import com.zhiyou100.video.model.Subject;
import com.zhiyou100.video.model.Video;

public interface FrontVideoService {

	Video findVideoById(Integer videoId);

	Course findCourseById(Integer course_id);

	Speaker findSpeakerById(Integer speaker_id);

	List<Video> findVideoByCId(Integer id);

	void updateVideoPlayTimes(Integer videoId);

	Subject findSubjectById(Integer subjectId);

}
