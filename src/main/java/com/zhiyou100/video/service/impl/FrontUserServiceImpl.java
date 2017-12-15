package com.zhiyou100.video.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.video.mapper.UserMapper;
import com.zhiyou100.video.model.User;
import com.zhiyou100.video.model.UserExample;
import com.zhiyou100.video.service.FrontUserService;

@Service
public class FrontUserServiceImpl implements FrontUserService{

	@Autowired
	private UserMapper um;
	
	@Override
	public void addUser(User u) {
		um.insertSelective(u);
	}

	@Override
	public List<User> findUserByUser(User u) {
		UserExample ue = new UserExample();
		ue.createCriteria().andEmailEqualTo(u.getEmail()).andPasswordEqualTo(u.getPassword());
		return  um.selectByExample(ue);
	}

	@Override
	public void updateUser(User u) {
		um.updateByPrimaryKeySelective(u);
	}

	@Override
	public User findUserById(Integer id) {
		return um.selectByPrimaryKey(id);
	}

	@Override
	public User findUserByEmail(String email) {
		UserExample ue = new UserExample();
		ue.createCriteria().andEmailEqualTo(email);
		User u = um.selectByExample(ue).get(0);
		return u;
	}

	

}
