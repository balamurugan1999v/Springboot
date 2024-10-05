package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.TransientAnnotationDomain;
import com.example.demo.service.TranscientService;

@RestController
@RequestMapping("/transient")
public class TranscientController {
	
	@Autowired
	public TranscientService transcientService;
	
	@PostMapping("/insertData")
	public String insertData(TransientAnnotationDomain data) {
		String response;
		try{
			transcientService.insertDataIntoTransient(data);
			response = "Success";
		} catch(Exception ex) {
			System.err.println(ex);
			response = "Failure";
		}
		return response;
		
	}

}
