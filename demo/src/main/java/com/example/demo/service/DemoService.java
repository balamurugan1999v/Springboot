package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.DemoDomain;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoService {
	
	@Autowired
	public DemoRepository demoRepo;

	public String insertData(DemoDomain data) {
		String returnMessage ="";
		try {
			System.out.println("Inserting the data into DB");
			demoRepo.save(data);
			returnMessage = "Success";
		} catch(Exception e) {
			e.printStackTrace();
			returnMessage = "Failure";
		}
		return returnMessage;
	}

	public List<DemoDomain> getData() {
		return demoRepo.findAll();
	}

}
