package com.zhiyou100.video.model;

public class Admin {
    private Integer id;

    private String login_name;

    private String login_pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name == null ? null : login_name.trim();
    }

    public String getLogin_pwd() {
        return login_pwd;
    }

    public void setLogin_pwd(String login_pwd) {
        this.login_pwd = login_pwd == null ? null : login_pwd.trim();
    }
}