package com.ives.core.shiro.token;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.ives.core.bean.user.Manager;
import com.ives.core.service.user.ManagerService;

/**
 * shiro 认证 + 授权
 * 
 * @author GPJ
 * @Time 2017-08-17
 */
public class MyRealm extends AuthorizingRealm {
	
	@Resource
	private ManagerService managerService;
	
	/**
	 * 认证信息，主要针对用户登录，
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
			throws AuthenticationException {

		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		//获取用户名及密码
		String username = token.getUsername();
		String password = new String(token.getPassword());
		//向数据库查询数据
		Manager manager = managerService.selectByUserAndPass(username, password);
		// 用户名错误
		if (null == manager) {
			throw new AccountException("帐号或密码不正确！");
		}
		// 检查是否为禁止登陆 status == false 那么就抛出<code>DisabledAccountException</code>
		if (!manager.getStatus()) {
			throw new DisabledAccountException("帐号已经禁止登录！");
		}
		
		//更新登陆时间 last_login_time
		manager.setLastLoginTime(new Date());
		managerService.updateByPrimaryKeySelective(manager);
		
		// 如果身份认证验证成功，返回一个AuthenticationInfo实现；
		return new SimpleAuthenticationInfo(manager,username, password);
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		return null;
	}
}
