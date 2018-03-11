package com.jlu.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jlu.service.TestService;

@Controller 
public class TestController {
	
	@Autowired
	private TestService testServie;
	
	@Autowired
	private DataSourceTransactionManager tx;
	
	@RequestMapping("/hello")
	public String helloWorld(Map<String, Object> model) {
		String users = testServie.test();;
		model.put("users", users);
		return "hello";
	}
}
