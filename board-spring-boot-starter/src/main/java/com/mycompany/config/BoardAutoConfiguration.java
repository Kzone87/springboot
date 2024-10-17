package com.mycompany.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mycompany.jdbc.MyDataSource;

@Configuration
@EnableConfigurationProperties(MyDataSourceProperties.class)
public class BoardAutoConfiguration {
	
	@Autowired
	private MyDataSourceProperties properties;
	
	@Bean
	public MyDataSource getMyDataSource() {
		MyDataSource datasource = new MyDataSource();
		datasource.setDriverClass(properties.getDriverClass());
		datasource.setUrl(properties.getUrl());
		datasource.setUsername(properties.getUsername());
		datasource.setPassword(properties.getPassword());
		return datasource;
	}

}
