package com.consultacep.consultacep.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.consultacep.consultacep.model.Cep;

@RestController
@RequestMapping("/consulta")
public class CepController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/cep")
	public Cep getCountries(){
		String url = "https://viacep.com.br/ws/08081010/json/";
		Cep cepObject = restTemplate.getForObject(url, Cep.class);
		System.out.println("Teste: "+cepObject);
		return cepObject;
	}
	
}
