package com.ives.core.shiro.token;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;

import com.ives.core.bean.user.Manager;

/**
 * 
 * @author GPJ
 * Shiro管理下的Token工具类
 */
public class TokenUtil {
	
	/**
	 * 获取当前登陆对象
	 * @return
	 */
	public static Manager getToken() {
		Manager manager = (Manager) SecurityUtils.getSubject().getPrincipal();
		return manager;
	}
	
	/**
	 * 获取当前用户的Session
	 * @return
	 */
	public static Session getSession() {
		return SecurityUtils.getSubject().getSession();
	}
	
	/**
	 * 获取当前登陆用户名
	 * @return
	 */
	public static String getManagerUsername() {
		return getToken() == null ? null : getToken().getUsername();
	}
	
	/**
	 * 获取当前用户Id
	 * @return
	 */
	public static Integer getManagerId() {
		return getToken() == null ? null : getToken().getId();
	}
	
	/**
	 * 登陆
	 * @param manager
	 * @param rememberMe
	 * @return
	 */
	public static Manager login(Manager manager, Boolean rememberMe) {
		UsernamePasswordToken token = new UsernamePasswordToken(manager.getUsername(), manager.getPassword());
		token.setRememberMe(rememberMe);
		SecurityUtils.getSubject().login(token);
		return getToken();
	}
}
