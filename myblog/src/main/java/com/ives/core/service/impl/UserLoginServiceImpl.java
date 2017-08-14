package com.ives.core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ives.core.bean.UserLogin;
import com.ives.core.dao.UserLoginDAO;
import com.ives.core.service.UserLoginService;

@Service("userLoginService")
@Transactional
public class UserLoginServiceImpl implements UserLoginService {
	
	@Resource
	private UserLoginDAO userLoginDAO;
	
	@Override
	public int insertUserLogin(UserLogin userLogin) {
		int i = userLoginDAO.insertUserLogin(userLogin);
		
		return i;
	}

}
