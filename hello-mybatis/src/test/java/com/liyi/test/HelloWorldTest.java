package com.liyi.test;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liyi.test.dao.UserMapper;
import com.liyi.test.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath*:applicationContext.xml")  
public class HelloWorldTest {
	@Resource
	private UserMapper userMapper;
	
	  @Test
	  public void testAddOpinion1() {
		 User user =  userMapper.selectByPrimaryKey(1);
		 System.out.println(user.getName());
	  }
}
