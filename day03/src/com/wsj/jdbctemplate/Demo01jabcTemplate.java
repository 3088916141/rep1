package com.wsj.jdbctemplate;

import java.util.List;

import com.wsj.bean.User;
import com.wsj.dao.UserDao;
import com.wsj.dao.UserDaoImp1;

public class Demo01jabcTemplate {

	public static void main(String[] args) {
		//通过当前调用方法
		UserDao ud = new UserDaoImp1();
		List<User>list = ud.findAllUser();
		for(User user:list) {
			System.out.println(user);
		}
	}
}
