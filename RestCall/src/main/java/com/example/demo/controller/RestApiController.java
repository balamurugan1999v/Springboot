package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.RestApiDomain;
import com.example.demo.service.RestApiService;

@RestController
public class RestApiController {

	@Autowired
	public RestApiService restService;
	
	@GetMapping("/getData")
	public List<RestApiDomain> getData() {
		System.out.println("It is reacher here");
		return restService.getData();
	}
}
