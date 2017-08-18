package com.ives.core.dao.user;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ives.core.bean.user.Manager;
import com.ives.core.bean.user.ManagerQuery;

public interface ManagerDao {
    int countByExample(ManagerQuery example);

    int deleteByExample(ManagerQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Manager record);

    int insertSelective(Manager record);

    List<Manager> selectByExample(ManagerQuery example);

    Manager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerQuery example);

    int updateByExample(@Param("record") Manager record, @Param("example") ManagerQuery example);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}