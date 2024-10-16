package com.mycompany.jdbc;

import lombok.Data;

@Data
public class MyDataSource {
	private String driverClass;
	private String url;
	private String username;
	private String password;
	
	public MyDataSource() {
		System.out.println("===> MyDataSource 생성");
	}

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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
	
	
	
}
