package com.karmanov.sakila.dao;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcActorDao extends JdbcDaoSupport implements ActorDao, CommonDao {

	Logger LOGGER = Logger.getLogger(JdbcActorDao.class);

	/**
	 * 
	 */
	public int getCount() {
		String sql = "SELECT COUNT(*) FROM actor";
		int result = getJdbcTemplate().queryForObject(sql, Integer.class);
		logger.info("Total number of actors in database: " + result);
		return result;
	}

}
