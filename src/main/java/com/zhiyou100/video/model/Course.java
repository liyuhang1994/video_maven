package com.zhiyou100.video.model;

import java.util.Date;
import java.util.List;

public class Course {
	private Integer id;

	private String course_name;

	private String course_descr;

	private Date insert_time;

	private Date update_time;

	private Integer subject_id;

	private String subject_name;

	private int average_times;
	
	private List<Video> videoList;
	

	public List<Video> getVideoList() {
		return videoList;
	}

	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}

	public int getAverage_times() {
		return average_times;
	}

	public void setAverage_times(int average_times) {
		this.average_times = average_times;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name == null ? null : course_name.trim();
	}

	public String getCourse_descr() {
		return course_descr;
	}

	public void setCourse_descr(String course_descr) {
		this.course_descr = course_descr == null ? null : course_descr.trim();
	}

	public Date getInsert_time() {
		return insert_time;
	}

	public void setInsert_time(Date insert_time) {
		this.insert_time = insert_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public Integer getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(Integer subject_id) {
		this.subject_id = subject_id;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course_name=" + course_name + ", course_descr=" + course_descr + ", insert_time="
				+ insert_time + ", update_time=" + update_time + ", subject_id=" + subject_id + ", subject_name="
				+ subject_name + ", average_times=" + average_times + "]";
	}
}