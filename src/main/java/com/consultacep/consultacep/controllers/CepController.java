package com.consultacep.consultacep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.consultacep.consultacep.model.Cep;

@RestController
public class CepController {
	
	@Autowired
	private RestTemplate restTemplate;

	public Cep getCountries(){
		String url = "https://viacep.com.br/ws/08081010/json/";
		Cep cepObject = restTemplate.getForObject(url, Cep.class);
		
		return cepObject;
	}
	
}
