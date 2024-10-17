package com.mycompany;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.mycompany.domain.Board;
import com.mycompany.service.BoardService;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class BoardControllerBizTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private BoardService boardService;
	
	@Test
	public void testGetBoardList() throws Exception {
		List<Board> boardList = new ArrayList<Board>();
		for (int i=0; i<5; i++) {
			Board board = new Board();
			board.setSeq(i);
			board.setTitle("제목" + i);
			board.setWriter("테스터");
			board.setContent(i + "번쨰 테스트 내용 원 투 쓰리");
			board.setCreateDate(new Date());
			
			boardList.add(board);
		}
		when(boardService.getBoardList()).thenReturn(boardList);
	
		// HTTP 요청
		mockMvc.perform(MockMvcRequestBuilders.get("/getBoardList"))
		
		// HTTP 응답 검증
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$[0].title").value("제목0"));
	}

}
