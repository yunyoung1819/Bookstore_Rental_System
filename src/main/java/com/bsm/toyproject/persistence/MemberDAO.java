package com.bsm.toyproject.persistence;

import com.bsm.toyproect.domain.MemberVO;

public interface MemberDAO {

	public String getTime();
	
	public void insertMember(MemberVO vo);
	
}
