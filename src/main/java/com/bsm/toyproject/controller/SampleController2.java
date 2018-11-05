package com.bsm.toyproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	// String이 리턴 타입인 경우 : 문자열 + jsp 파일을 찾아서 실행 (result.jsp 파일 실행)
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String msg) {
		
		logger.info("doC called........");
		
		return "result";
	}
}
