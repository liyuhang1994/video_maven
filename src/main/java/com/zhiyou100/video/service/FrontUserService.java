package com.zhiyou100.video.service;

import java.util.List;

import com.zhiyou100.video.model.User;

public interface FrontUserService {

	void addUser(User u);

	List<User> findUserByUser(User u);

	void updateUser(User u);

	User findUserById(Integer id);

	User findUserByEmail(String email);

}
