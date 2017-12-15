package com.zhiyou100.video.model;

public class Subject {
    private Integer id;

    private String subject_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name == null ? null : subject_name.trim();
    }

	@Override
	public String toString() {
		return "Subject [id=" + id + ", subject_name=" + subject_name + "]";
	}
    
}