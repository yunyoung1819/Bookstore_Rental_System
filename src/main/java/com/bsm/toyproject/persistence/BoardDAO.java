package com.bsm.toyproject.persistence;

import java.util.List;

import com.bsm.toyproject.domain.BoardVO;

/**
 * BoardDAO Interface
 * @author yunyoung
 *
 */
public interface BoardDAO {

	public void create(BoardVO vo) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;

}
