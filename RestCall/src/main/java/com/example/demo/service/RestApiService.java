package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.domain.RestApiDomain;

@Service
public class RestApiService {
	
	@Value("${spring.demo.service.url}")
	public String demoServiceUrl;
	
//	@Autowired
//	public RestTemplate restTemplate;
	
	public List<RestApiDomain> getData(){
		System.out.println("Calling to DemoApplication");
		return callToDemoApplication();
	}

	private List<RestApiDomain> callToDemoApplication() {
		System.out.println(demoServiceUrl);
		RestTemplate restTemplate = new RestTemplate();
		System.out.println("Before rest api call");
		ResponseEntity<RestApiDomain> responseEntity = restTemplate.exchange(demoServiceUrl, HttpMethod.GET, null, RestApiDomain.class);
		System.out.println("After rest api");
		System.out.println((List<RestApiDomain>) responseEntity.getBody());
		return null;
	}

}
