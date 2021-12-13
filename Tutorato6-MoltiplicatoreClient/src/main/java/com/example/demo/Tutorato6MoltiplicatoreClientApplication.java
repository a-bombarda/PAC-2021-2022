package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Tutorato6MoltiplicatoreClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tutorato6MoltiplicatoreClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) {
		return args -> {
			Result returnedResult = restTemplate.getForObject(
					"http://localhost:8080/moltiplica?num1=2&num2=5", 
					Result.class);
			
			System.out.println(returnedResult.toString());
		};
	}

}
