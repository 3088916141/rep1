package com.wsj.jdbctemplate;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.wsj.dao.*;
import com.wsj.bean.User;
import com.wsj.druid.JDBCUtils;



public class Demo01jdbcTemplate2 {
public static void main(String[] args) {
	
    	addUser();
    }

private static void updateUser() {
	JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
	int update=jt.update("update t_user set name =?","三太子");
	System.out.println(update);
}
    private static void addUser() {
    	JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
    	String sql = "insert  into t_user (id,name) values ('10','二郎神')";
    	int update = jt.update(sql);
    	System.out.println(update);
    }
    private static void findALLUser() {
    	JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "select * from t_user";
        List<User> list = jt.query(sql,new BeanPropertyRowMapper<User>(User.class));
        for(User user : list) {
        	System.out.println(user);
    }
    
}
}
