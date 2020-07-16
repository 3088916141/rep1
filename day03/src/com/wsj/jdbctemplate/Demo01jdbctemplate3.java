package com.wsj.jdbctemplate;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.wsj.bean.User;
import com.wsj.druid.JDBCUtils;

public class Demo01jdbctemplate3 {
	public static void main(String[] args) {
		 addperson();
		 //deleteperson1();
		 //deleteperson2();
		// updateperson();
		//findperson2();
		//findperson1();
	}
	private static void addperson() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = "insert into person(id,name,username,password,age,des,height) values (?,?,?,?,?,?,?)";
		int update1 = jt.update(sql, 1,"奥恩", "aoen", "1234567", 23, "这个英雄太肉了", 188);
		int update2 = jt.update(sql, 2,"青钢影", "qinggangying", "123456", 1003, "战士类", "188");
		int update3 = jt.update(sql,3, "盖伦", "gailun", "123456", 23, "有肉有输出", "200");
		int update4 = jt.update(sql,4,"剑姬", "jianji", "123456", 23, "打破绽", "200");
		int update5 = jt.update(sql,5, "拉克丝", "lakesi", "123456", 23, "技能靠随缘", "200");
		System.out.println(update1+update2+update3+update4+update5);
	}
	private static void deleteperson1() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		int update = jt.update("delete from person where id = ?", 5);
		System.out.println(update);
	}

	private static void deleteperson2() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		int update = jt.update("delete from person where name = ?", "奥恩");
		System.out.println(update);
	}
	private static void updateperson() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		int update = jt.update("update person set name = ? where name = '青钢影'", "奥巴马");
		System.out.println(update);
	}
	/*
	 * private static void addperson() { JdbcTemplate jt = new
	 * JdbcTemplate(JDBCUtils.getDataSource()); String sql =
	 * "insert into person(name,username,password,age,des,height) values (?,?,?,?,?,?)"
	 * ; int update1 = jt.update(sql, "奥恩", "aoen", "123456", 23, "这个英雄太肉了", "188");
	 * int update2 = jt.update(sql, "青钢影", "qinggangying", "123456", 1003, "战士类",
	 * "188"); int update3 = jt.update(sql, "盖伦", "gailun", "123456", 23, "有肉有输出",
	 * "200"); int update4 = jt.update(sql, "剑姬", "jianji", "123456", 23, "打破绽",
	 * "200"); int update5 = jt.update(sql, "拉克丝", "lakesi", "123456", 23, "技能靠随缘",
	 * "200"); System.out.println(update1+update2+update3+update4+update5); }
	 */

	private static void findperson2() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		List<User> person = jt.query("select * from person ", new BeanPropertyRowMapper<>(User.class));
		System.out.println(person);
	}

	private static void findperson1() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		User person = jt.queryForObject("select * from person where id = ?", new BeanPropertyRowMapper<>(User.class),2);
		System.out.println(person);
	}

	/*
	 * private static void addperson() { JdbcTemplate jt = new
	 * JdbcTemplate(JDBCUtils.getDataSource()); String sql =
	 * "insert into person(name,username,password,age,des,height) values (?,?,?,?,?,?)"
	 * ; int update = jt.update(sql, "奥恩", "aoen", "1234567", 23, "这英雄太肉了", "188");
	 * System.out.println(update); }
	 */

	/*
	 * private static void deleteperson1() { JdbcTemplate jt = new
	 * JdbcTemplate(JDBCUtils.getDataSource()); int update =
	 * jt.update("delete from person where id = ?", 0); System.out.println(update);
	 * }
	 * 
	 * private static void deleteperson2() { JdbcTemplate jt = new
	 * JdbcTemplate(JDBCUtils.getDataSource()); int update =
	 * jt.update("delete from person where name = ?", "奥恩");
	 * System.out.println(update); }
	 */
	/*
	 * private static void updateperson() { JdbcTemplate jt = new
	 * JdbcTemplate(JDBCUtils.getDataSource()); int update =
	 * jt.update("update person set name = ? where name = '青钢影'", "奥巴马");
	 * System.out.println(update); }
	 */

	/*
	 * private static void findperson1() { JdbcTemplate jt = new
	 * JdbcTemplate(JDBCUtils.getDataSource()); User person =
	 * jt.queryForObject("select * from person where id = ?", new
	 * BeanPropertyRowMapper<>(User.class), 2); System.out.println(person); }
	 */
	/*
	 * private static void findperson2() { JdbcTemplate jt = new
	 * JdbcTemplate(JDBCUtils.getDataSource()); List<User> person =
	 * jt.query("select * from person ", new BeanPropertyRowMapper<>(User.class));
	 * System.out.print(person); }
	 */
}