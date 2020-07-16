package com.wsj.bean;

public class User {
	private Integer id;
	private String name;
	private String username;
	private String password;
	private Integer age;
	private String desc;
	private Double heigeht;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getHeigeht() {
		return heigeht;
	}
	public void setHeigeht(Double heigeht) {
		this.heigeht = heigeht;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", age="
				+ age + ", desc=" + desc + ", heigeht=" + heigeht + "]";
	}
	
}
