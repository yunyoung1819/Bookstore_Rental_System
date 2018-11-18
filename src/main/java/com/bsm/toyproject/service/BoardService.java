package com.bsm.toyproject.service;

import java.util.List;

import com.bsm.toyproject.domain.BoardVO;

public interface BoardService {

	public void regist(BoardVO board) throws Exception;	// 등록 
	
	public BoardVO read(Integer bno) throws Exception;	// 조회
	
	public void modify(BoardVO board) throws Exception; // 수정 
	
	public void remove(Integer bno) throws Exception;   // 삭제 
	
	public List<BoardVO> listAll() throws Exception;    // 전체 조회 
	
}
