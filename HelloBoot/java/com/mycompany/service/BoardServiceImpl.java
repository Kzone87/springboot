package com.mycompany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.mycompany.domain.Board;
import com.mycompany.jdbc.MyDataSource;
import com.mycompany.persistence.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardRepository boardRepository;
	
	public List<Board> getBoardList() {
		System.out.println("===> BoardService.getBoardList() 실행");
		return boardRepository.getBoardList();
	}

}
