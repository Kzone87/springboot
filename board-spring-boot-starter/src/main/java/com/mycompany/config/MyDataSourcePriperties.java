package com.mycompany.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "board.jdbc")
@Data
public class MyDataSourcePriperties {
	private String driverClass;
	private String url;
	private String username;
	private String password;

}
