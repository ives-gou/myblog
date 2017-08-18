package com.ives.core.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ives.core.bean.user.Manager;
import com.ives.core.bean.user.ManagerQuery;
import com.ives.core.dao.user.ManagerDao;
import com.ives.core.service.user.ManagerService;

@Service("ManagerService")
public class ManagerServiceImpl implements ManagerService{
	
	@Resource
	private ManagerDao managerDao;
	
	public Manager selectByUserAndPass(String username, String password) {
		//创建查询对象
		ManagerQuery managerQuery = new ManagerQuery();
		//设置查询条件
		managerQuery.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
		//查询结果
		List<Manager> listManager = managerDao.selectByExample(managerQuery);
		if (null != listManager && listManager.size() > 0) {
			return listManager.get(0);
		}
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Manager manager) {
		
		return managerDao.updateByPrimaryKeySelective(manager);
	}
}
