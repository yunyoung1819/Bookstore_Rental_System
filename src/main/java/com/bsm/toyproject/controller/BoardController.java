package com.bsm.toyproject.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bsm.toyproject.domain.BoardVO;
import com.bsm.toyproject.service.BoardService;

/**
 * 자유 게시판
 * @author yunyoung
 *
 */

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;
	
	// 게시물 등록
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception {
		
		logger.info("register get...........");
		
	}
	
	// 게시물 등록 
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(BoardVO board, Model model) throws Exception {
		
		logger.info("regist post..........");
		logger.info(board.toString());
		
		service.regist(board);
		
		model.addAttribute("result", "success");
		
		return "/board/success";
		
	}
	
	// 전체 목록 조회
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		
		logger.info("show all list...............");
		model.addAttribute("list", service.listAll());
	}
	
	// 게시물 조회
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception {
		
		System.out.println("read......");
		
		model.addAttribute(service.read(bno));
	}
}
