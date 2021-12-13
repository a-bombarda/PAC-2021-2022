package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Tutorato6NumberMultiplierClientWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tutorato6NumberMultiplierClientWithSpringApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) {
		return args -> {
			Result r = restTemplate.getForObject("http://localhost:8080/multiply?n=4&m=10", Result.class);
			System.out.println(r.toString());
		}; 
	}

}
