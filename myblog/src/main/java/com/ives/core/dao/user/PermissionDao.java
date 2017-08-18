package com.ives.core.dao.user;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ives.core.bean.user.Permission;
import com.ives.core.bean.user.PermissionQuery;

public interface PermissionDao {
    int countByExample(PermissionQuery example);

    int deleteByExample(PermissionQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionQuery example);

    Permission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionQuery example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionQuery example);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}