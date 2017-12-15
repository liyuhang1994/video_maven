package com.zhiyou100.video.model;

import java.util.Date;

public class User {
    private Integer id;

    private String nick_name;

    private Integer sex;

    private Date birthday;

    private String email;

    private String province;

    private String city;

    private String head_url;

    private String password;

    private Date insert_time;

    private Date update_time;

    private String captcha;
    
    private String birthdayStr;
    
    

    public String getBirthdayStr() {
		return birthdayStr;
	}

	public void setBirthdayStr(String birthdayStr) {
		this.birthdayStr = birthdayStr;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name == null ? null : nick_name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getHead_url() {
        return head_url;
    }

    public void setHead_url(String head_url) {
        this.head_url = head_url == null ? null : head_url.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha == null ? null : captcha.trim();
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", nick_name=" + nick_name + ", sex=" + sex + ", birthday=" + birthday + ", email="
				+ email + ", province=" + province + ", city=" + city + ", head_url=" + head_url + ", password="
				+ password + ", insert_time=" + insert_time + ", update_time=" + update_time + ", captcha=" + captcha
				+ "]";
	}
    
}