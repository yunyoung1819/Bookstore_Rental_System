package com.bsm.toyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bsm.toyproect.domain.ProductVO;

@Controller
public class SampleController5 {

	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {
		
		ProductVO vo = new ProductVO("샘플 상품", 30000);
		
		return vo;
	}
}
