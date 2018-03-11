package com.jlu.dao.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jlu.dao.UserDao;
import com.jlu.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertOneRow() {
		jdbcTemplate.update("insert into user (user_name, password, user_id, email) values ('jlu', 'password', '137094', 'jie.lu@dhc.com.cn')");
	}

	public void insertAnotherOneRow() {
		jdbcTemplate.update("insert into user (user_name, password, user_id, email) values ('lujie', 'password', '127095', 'jie.lu@dhc.com.cn')");
	}
	
	public void deleteUserTb() {
		jdbcTemplate.update("delete from user");
	}
	
	public User findUserById(String id) {
		String sql = "select * from user where user_id = ?";
//		return jdbcTemplate.queryForObject(sql,
//				(rs, rowNum) -> {
//					return new User(
//							rs.getString("user_id"),
//							rs.getString("user_name"),
//							rs.getString("password")
//							);
//				},
//		
		User user = jdbcTemplate.queryForObject(sql, new userRowMapper(), id);
		return user;
	}
	
	private static final class userRowMapper implements RowMapper<User> {
		
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new User(
					rs.getString("user_id"),
					rs.getString("user_name"),
					rs.getString("password")
					);
		}
	}
}
