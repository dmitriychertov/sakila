package com.karmanov.sakila.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcActorDaoTest {

	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		JdbcActorDao dao = applicationContext.getBean("actorDao", JdbcActorDao.class);
		int result = dao.getCount();
		assertEquals(200, result);
	}

}
