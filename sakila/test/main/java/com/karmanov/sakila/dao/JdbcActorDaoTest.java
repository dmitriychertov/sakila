package com.karmanov.sakila.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcActorDaoTest {
	
	ApplicationContext applicationContext;
	
	@Before
	public void setUp() {
		applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
	}

	@Test
	public void test() {
		JdbcActorDao dao = applicationContext.getBean("actorDao", JdbcActorDao.class);
		int result = dao.getCount();
		assertEquals(200, result);
	}

}
