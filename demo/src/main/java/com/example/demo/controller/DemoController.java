package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.DemoDomain;
import com.example.demo.service.DemoService;

@Controller
@ResponseBody
public class DemoController {
	
	@Autowired
	public DemoService demoService;

	@PostMapping("/insertData")
	public String insertData(@RequestBody DemoDomain data) {
		System.out.println("Entering into insert Data");
		String response = demoService.insertData(data);
		System.out.println("Exit from insert Data");
		return response;		
	}
	
	@RequestMapping(value="/getData")
	public List<DemoDomain> getData() {
		System.out.println("Entering Here");
		List<DemoDomain> result = demoService.getData();
		System.out.println("Returning Data");
		return result;
	}
	
	@GetMapping("/hello")
	public String getMessage(){
		return "Hello";
	}
	
	
}
