package com.ives.core.controller.user;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 登录控制器
 * 登录
 * 注册
 * 注销
 * @author GPJ
 */
@Controller
public class LoginController {
	
	/**
	 * 用户登录页面
	 * @return
	 */
	@RequestMapping(value="/user/login", method=RequestMethod.GET)
	public String login() {
		return "user/login";
	}
	
	@RequestMapping(value="/user/login", method=RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> doLogin() {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		
		return resultMap;
	}
}
