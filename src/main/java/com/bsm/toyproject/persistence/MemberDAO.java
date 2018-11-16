package com.bsm.toyproject.persistence;

import com.bsm.toyproject.domain.MemberVO;

public interface MemberDAO {

	public String getTime();
	
	// 사용자의 등록 
	public void insertMember(MemberVO vo);
	
	// 사용자의 조회
	public MemberVO readMember(String userid) throws Exception;
	
	public MemberVO readWithPW(String userid, String userpw) throws Exception;
	
}
