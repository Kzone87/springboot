package com.mycompany;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.mycompany")
public class HelloBootApplication {

	public static void main(String[] args) {
		//web어플리케이션 구동
//		SpringApplication.run(HelloBootApplication.class, args);
		
		//자바어플리케이션 구동
//		SpringApplication application = new SpringApplication(HelloBootApplication.class);
//		application.setWebApplicationType(WebApplicationType.NONE);
//		application.run(args);
		
		//어플리케이션 배너제거
		SpringApplication application = new SpringApplication(HelloBootApplication.class);
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}
