package com.liyi.test;

<<<<<<< HEAD
import java.util.HashSet;
import java.util.Set;

=======
>>>>>>> 79779559ac47f69d12be35b1da5b9f1fe60ee242
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

<<<<<<< HEAD
}
=======
}
>>>>>>> 79779559ac47f69d12be35b1da5b9f1fe60ee242
