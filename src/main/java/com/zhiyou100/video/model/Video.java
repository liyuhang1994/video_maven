package com.zhiyou100.video.model;

import java.util.Date;

public class Video {
	private Integer id;

	private String video_title;

	private Integer speaker_id;

	private Integer course_id;

	private Integer video_length;

	private String video_image_url;

	private String video_url;

	private String video_descr;

	private Date insert_time;

	private Date update_time;

	private Integer video_play_times;

	private String speaker_name;
	private String course_name;
	private String videoLength;

	public String getVideoLength() {
		return videoLength;
	}

	public void setVideoLength(String videoLength) {
		this.videoLength = videoLength;
	}

	public String getSpeaker_name() {
		return speaker_name;
	}

	public void setSpeaker_name(String speaker_name) {
		this.speaker_name = speaker_name;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVideo_title() {
		return video_title;
	}

	public void setVideo_title(String video_title) {
		this.video_title = video_title == null ? null : video_title.trim();
	}

	public Integer getSpeaker_id() {
		return speaker_id;
	}

	public void setSpeaker_id(Integer speaker_id) {
		this.speaker_id = speaker_id;
	}

	public Integer getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}

	public Integer getVideo_length() {
		return video_length;
	}

	public void setVideo_length(Integer video_length) {
		this.video_length = video_length;
	}

	public String getVideo_image_url() {
		return video_image_url;
	}

	public void setVideo_image_url(String video_image_url) {
		this.video_image_url = video_image_url == null ? null : video_image_url.trim();
	}

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url == null ? null : video_url.trim();
	}

	public String getVideo_descr() {
		return video_descr;
	}

	public void setVideo_descr(String video_descr) {
		this.video_descr = video_descr == null ? null : video_descr.trim();
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

	public Integer getVideo_play_times() {
		return video_play_times;
	}

	public void setVideo_play_times(Integer video_play_times) {
		this.video_play_times = video_play_times;
	}

	@Override
	public String toString() {
		return "Video [id=" + id + ", video_title=" + video_title + ", speaker_id=" + speaker_id + ", course_id="
				+ course_id + ", video_length=" + video_length + ", video_image_url=" + video_image_url + ", video_url="
				+ video_url + ", video_descr=" + video_descr + ", insert_time=" + insert_time + ", update_time="
				+ update_time + ", video_play_times=" + video_play_times + ", speaker_name=" + speaker_name
				+ ", course_name=" + course_name + "]";
	}
	
}