package com.wsj.dao;

import java.util.List;

import javax.swing.JTable;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.xml.Jdbc4SqlXmlHandler;

import com.alibaba.druid.util.JdbcUtils;
import com.wsj.bean.User;
import com.wsj.druid.JDBCUtils;

public class UserDaoImp1 implements UserDao {
	//创建jabctemplate对象
	JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
	

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		String sql = "select * from t_user";
		List<User> list = jt.query(sql,new BeanPropertyRowMapper<User>(User.class));
		return list;
	}

}
