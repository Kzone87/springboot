package com.mycompany.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mycompany.domain.Board;

@Repository
public class BoardRepository {
	
	public List<Board> getBoardList(){
		List<Board> boardList = new ArrayList<Board>();
		
		for (int i=0; i<10; i++) {
			Board board = new Board();
			board.setSeq(i);
			board.setTitle("제목" + i);
			board.setWriter("테스터");
			board.setContent(i + "번쨰 테스트 내용 원 투 쓰리");
			board.setCreateDate(new Date());
			
			boardList.add(board);
		}
		
		return boardList;
	}

}
