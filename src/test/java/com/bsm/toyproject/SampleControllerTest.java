package com.bsm.toyproject;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/*
 * WAS 없이 컨트롤러 테스트하기
 * 
 * 스프링 3.2 버전부터는 jUnit 만을 사용해서 스프링 MVC 에서 작성된 컨트롤러를 테스트할 수 있는데
 * WAS 에서 테스트해보는 것이 어려운 경우에 유용하게 사용될 수 있음 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class SampleControllerTest {

	private static final Logger logger = LoggerFactory.getLogger(SampleControllerTest.class);
	
	@Inject
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;	// 브라우저에서 요청과 응답을 의미하는 객체 
	
    /* 테스트시 가상의 요청과 응답을 처리하기 위해 setup 메소드에서 @Before 애노테이션으로 처리되어 
     * 매번 테스트 메소드의 실행 전에 MockMvc 객체를 생성함 */
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		logger.info("setup.....");
	}
	
	@Test
	public void testDoA() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/doA")); // get(), post() 이용 
	}

}
