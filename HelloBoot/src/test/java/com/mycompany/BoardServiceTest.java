package com.mycompany;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mycompany.service.BoardService;

@SpringBootTest
public class BoardServiceTest {
	
	@Autowired
	private BoardService boardService;
	
	@Test
	public void testGetBoardList() throws Exception {
		assertEquals(10, boardService.getBoardList().size());
	}

}
