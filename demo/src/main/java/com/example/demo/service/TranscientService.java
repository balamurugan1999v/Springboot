package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.TransientAnnotationDomain;
import com.example.demo.repository.TransientRepository;

@Service
public class TranscientService {
	
	@Autowired
	public TransientRepository transcientRepo;

	public void insertDataIntoTransient(TransientAnnotationDomain data) {
		transcientRepo.save(data);
	}

}
