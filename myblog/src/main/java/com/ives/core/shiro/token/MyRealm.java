package com.ives.core.shiro.token;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * shiro 认证 + 授权
 * 
 * @author GPJ
 * @Time 2017-08-17
 */
public class MyRealm extends AuthorizingRealm {

	/**
	 * 认证信息，主要针对用户登录，
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
			throws AuthenticationException {

		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

		String username = token.getUsername();
		String password = new String(token.getPassword());

		// 用户名错误
		if (!"admin".equals(username)) {
			throw new UnknownAccountException();
		}
		// 密码错误
		if (!"123456".equals(password)) {
			throw new IncorrectCredentialsException();
		}

		// 如果身份认证验证成功，返回一个AuthenticationInfo实现；
		return new SimpleAuthenticationInfo(username, password, getName());
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		return null;
	}
}
