package com.mycompany.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.domain.Board;
import com.mycompany.service.BoardService;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("hello")
	public String Hello(String name) {
		return "Hello : " + name;
	}
	
	@GetMapping("/getBoard")
	public Board getBoard() {
		Board board = new Board();
		board.setSeq(1);
		board.setTitle("테스트 제목");
		board.setWriter("테스터");
		board.setContent("테스트 내용 원 투 쓰리");
		board.setCreateDate(new Date());
		
		return board;
	}
	
	@GetMapping("/getBoardList")
	public List<Board> getBoardList(){
		return boardService.getBoardList();
	}
	
}
