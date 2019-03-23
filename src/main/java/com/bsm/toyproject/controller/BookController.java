package com.bsm.toyproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 도서/음반/DVD
 * 
 * @author yunyoung
 *
 */
@Controller
@RequestMapping("/book/*")
public class BookController {

	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	// 전체 목록 조회 
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		
		logger.info("show all book list..........");
		model.addAttribute("booklist", "booklist");
	}
}
