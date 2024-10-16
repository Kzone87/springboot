package com.mycompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.mycompany.jdbc.MyDataSource;

@Service
public class BoardService implements ApplicationRunner {

	@Autowired
	private MyDataSource datasource;
	
	public BoardService() {
		System.out.println("==> BoardService 생성");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(datasource.getUrl() + "DB 연결 성공");
	}
	
}
