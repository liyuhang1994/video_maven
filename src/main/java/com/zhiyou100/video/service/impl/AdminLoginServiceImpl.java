package com.zhiyou100.video.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.video.mapper.AdminMapper;
import com.zhiyou100.video.model.Admin;
import com.zhiyou100.video.service.AdminLoginService;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{

	@Autowired
	private AdminMapper am;
	
	@Override
	public Admin findAdminByPwd(Admin adm) {
		return am.findAdminByPwd(adm);
	}

	@Override
	public Admin findAdminByName(String login_name) {
		Admin a = am.findAdminByName(login_name);
		return a;
	}

}
