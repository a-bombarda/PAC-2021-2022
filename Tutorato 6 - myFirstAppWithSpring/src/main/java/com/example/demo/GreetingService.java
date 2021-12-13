package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	public Greetings greeting(String name, AtomicLong counter) {
		return new Greetings(counter.incrementAndGet(), 
				"Hello, " + name);
	}
	
}
