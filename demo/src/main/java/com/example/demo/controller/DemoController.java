package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.DemoDomain;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	public DemoService demoService;

	@PostMapping("/insertData")
	public String insertData(DemoDomain data) {
		String response = demoService.insertData(data);
		return response;
		
	}
}
