package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.domain.RestApiDomain;

@Service
public class RestApiService {
	
	@Value("${spring.demo.service.url}")
	public String demoServiceUrl;
	
	@Value("${spring.demo.hello.service.url}")
	public String helloServiceUrl;
	
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
		//String response = restTemplate.getForObject(helloServiceUrl, String.class);
		//System.out.println(response);
		List<RestApiDomain> responseEntity = (List<RestApiDomain>) restTemplate.getForObject(demoServiceUrl, RestApiDomain.class);
		//ResponseEntity<RestApiDomain> responseEntity = restTemplate.exchange(demoServiceUrl, HttpMethod.GET, null, RestApiDomain.class);
		System.out.println("After rest api");
		//System.out.println((List<RestApiDomain>) responseEntity.getBody());
		return null;
	}

}
