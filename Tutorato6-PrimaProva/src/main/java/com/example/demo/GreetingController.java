package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService service = new GreetingService();
	
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting sayHello(@RequestParam(defaultValue = "World") String name) {
		return service.sayHello(name, counter);
	}
	
}
