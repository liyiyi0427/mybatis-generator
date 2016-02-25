package com.liyi.test.dao;


import com.liyi.test.domain.User;
import com.liyi.test.util.DataSource;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);
    @DataSource("111")
    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}