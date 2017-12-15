package com.zhiyou100.video.service;

import com.zhiyou100.video.model.Admin;

public interface AdminLoginService {

	Admin findAdminByPwd(Admin adm);

	Admin findAdminByName(String login_name);

}
