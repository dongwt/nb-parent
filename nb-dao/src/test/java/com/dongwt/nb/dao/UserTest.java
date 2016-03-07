package com.dongwt.nb.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dongwt.nb.dao.b.UserDao;
import com.dongwt.nb.model.b.User;

public class UserTest {
	ApplicationContext context;
	private UserDao userDao;
	
	@Before
	public void before(){
		context = new ClassPathXmlApplicationContext("mongodb-context.xml");
		userDao = (UserDao) context.getBean("userDao");
	}
	
	@Test
	public void save(){
		userDao.addUser(new User("dongwt","dick","000000","834575475@qq.com","15821036204",1));
	}

}
