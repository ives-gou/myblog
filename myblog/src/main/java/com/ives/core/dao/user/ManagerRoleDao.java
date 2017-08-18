package com.ives.core.dao.user;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ives.core.bean.user.ManagerRole;
import com.ives.core.bean.user.ManagerRoleQuery;

public interface ManagerRoleDao {
    int countByExample(ManagerRoleQuery example);

    int deleteByExample(ManagerRoleQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerRole record);

    int insertSelective(ManagerRole record);

    List<ManagerRole> selectByExample(ManagerRoleQuery example);

    ManagerRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerRole record, @Param("example") ManagerRoleQuery example);

    int updateByExample(@Param("record") ManagerRole record, @Param("example") ManagerRoleQuery example);

    int updateByPrimaryKeySelective(ManagerRole record);

    int updateByPrimaryKey(ManagerRole record);
}