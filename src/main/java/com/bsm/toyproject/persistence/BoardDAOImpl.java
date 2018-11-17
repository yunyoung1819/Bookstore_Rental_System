package com.bsm.toyproject.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bsm.toyproject.domain.BoardVO;

/**
 * 1. BoardDAO Interface
 * 2. boardMapper.xml
 * 3. BoardDAOImpl Class
 *
 */
@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.bsm.toyproject.mapper.BoardMapper";

	@Override
	public void create(BoardVO vo) throws Exception {
		
		session.insert(namespace + ".create", vo); 
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		
		return session.selectOne(namespace + ".read", bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		
		session.update(namespace + ".update", vo);
		
	}

	@Override
	public void delete(Integer bno) throws Exception {
		
		session.delete(namespace + ".delete", bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		
		return session.selectList(namespace + ".listAll");
	}
	
	
}
