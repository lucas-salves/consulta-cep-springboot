package com.consultacep.consultacep.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CepController {
	
	@Autowired
	private RestTemplate restTemplate;
	
}
