package com.ives.core.service;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ives.core.bean.UserLogin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-context.xml"})
public class UserLoginServiceTest {
	
	@Resource
	private UserLoginService userLoginService;
	
	@Test
	public void test() {
		UserLogin userLogin = new UserLogin();
		userLogin.setMobile("18281774034");
		userLogin.setEmail("iamgpj2@163.com");
		userLogin.setStatus(false);
		userLogin.setPassword("111111");
		userLogin.setCreateTime(new Date());
		userLogin.setLastLoginTime(new Date());
		int i = userLoginService.insertUserLogin(userLogin);
		System.out.println(i);
	}

}
