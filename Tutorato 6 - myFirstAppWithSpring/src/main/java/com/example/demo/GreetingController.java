package com.example.demo;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@Autowired
	private GreetingService greetingService = new GreetingService();
	
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greetings greeting(@RequestParam(defaultValue = "AA") String name) {
		return greetingService.greeting(name, counter);
	}
	
}
