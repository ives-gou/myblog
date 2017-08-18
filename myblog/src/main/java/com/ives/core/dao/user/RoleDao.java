package com.ives.core.dao.user;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ives.core.bean.user.Role;
import com.ives.core.bean.user.RoleQuery;

public interface RoleDao {
    int countByExample(RoleQuery example);

    int deleteByExample(RoleQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleQuery example);

    Role selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleQuery example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleQuery example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}