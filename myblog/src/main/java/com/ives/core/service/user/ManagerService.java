package com.ives.core.service.user;

import com.ives.core.bean.user.Manager;

public interface ManagerService {
	
	/**
	 * 通过用户名与密码查询数据
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	Manager selectByUserAndPass(String username, String password);
	
	/**
	 * 通过主键修改
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(Manager record);
}
