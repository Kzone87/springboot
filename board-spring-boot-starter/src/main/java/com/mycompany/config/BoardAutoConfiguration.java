package com.mycompany.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mycompany.jdbc.MyDataSource;

@AutoConfiguration
public class BoardAutoConfiguration {
	
	@Bean
	public MyDataSource getMyDatasource() {
		MyDataSource datasource = new MyDataSource();
		datasource.setDriverClass("oracle.jdbc.driver.OracleDriver");
		datasource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		datasource.setUsername("hr");
		datasource.setPassword("hr");
		return datasource;
	}
	
}
