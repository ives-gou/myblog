package com.ives.core.controller.user;

import java.util.HashMap;

import org.apache.shiro.authc.DisabledAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ives.core.bean.user.Manager;
import com.ives.core.shiro.token.TokenUtil;

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
	
	/**
	 * 用户登录提交
	 * @param manager
	 * @param rememberMe
	 * @return
	 */
	@RequestMapping(value="/user/login", method=RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> doLogin(Manager manager, Boolean rememberMe) {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		try {
			TokenUtil.login(manager, rememberMe);
			resultMap.put("status", 200);
			resultMap.put("message", "登录成功");
			
			//跳转地址
			resultMap.put("back_url", "/");
			
		} catch (DisabledAccountException e) {
			resultMap.put("status", 500);
			resultMap.put("message", "帐号已经禁用。");
		} catch (Exception e) {
			resultMap.put("status", 500);
			resultMap.put("message", "帐号或密码错误");
		}
		
		return resultMap;
	}
}
