package com.wsj.druid;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class Demo01Druid {
public static void main(String[] args) throws Exception {
	//导入包
	//定义配置文件
	//加载配置文件
    Properties pro = new Properties();
    //加载器
    InputStream resourceAsStream= Demo01Druid.class.getClassLoader().getResourceAsStream("druid.properties");
    
    
    System.out.println(resourceAsStream);
    //load
    pro.load(resourceAsStream);
    
    String property = pro.getProperty("name");
    String password = pro.getProperty("password");
    System.out.println(property);
    System.out.println(password);
    //数据库连接对象
    DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
    
    System.out.println(dataSource.getConnection());
    Connection connection = dataSource.getConnection();
    
    java.sql.Statement createStatement = connection.createStatement();
    
    String sql  = "select * from t_user";
    ResultSet rs = createStatement.executeQuery(sql);
    
    while (rs.next()) {
    	String name = rs.getString("name");
    	//String address = rs.getString("address");
    	//Integer age = rs.getInt("age");
    	System.out.println(name);
    }
    connection.close();
}
}
