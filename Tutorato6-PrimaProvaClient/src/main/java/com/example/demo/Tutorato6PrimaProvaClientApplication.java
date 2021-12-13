package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Tutorato6PrimaProvaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tutorato6PrimaProvaClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) {
		return args -> {
			Greeting returnedGreeting = restTemplate.getForObject(
					"http://localhost:8080/greeting?name=Andrea", 
					Greeting.class);
			
			System.out.println(returnedGreeting.toString());
		};
	}

}
