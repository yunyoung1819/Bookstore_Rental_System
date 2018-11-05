package com.bsm.toyproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Sample Controller
 * @author yunyoung
 *
 */
@Controller
public class SampleController {

	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	// void 리턴 타입인 경우 : 현재 경로에 해당하는 JSP 파일을 실행 (doA.jsp 파일 실행)
	@RequestMapping("doA")
	public void doA() {
		
		logger.info("doA called........");
	}
	
	@RequestMapping("doB")
	public void doB() {
		
		logger.info("doB called........");
	}

}
