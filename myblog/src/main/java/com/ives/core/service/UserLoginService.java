package com.ives.core.service;

import com.ives.core.bean.UserLogin;

public interface UserLoginService {
	
	/**
	 * 添加用户
	 * @param userLogin 用户实体类
	 * @return
	 */
	int insertUserLogin(UserLogin userLogin);
}
