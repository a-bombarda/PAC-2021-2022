package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public Greeting sayHello(String name, AtomicLong counter) {
		return new Greeting(counter.incrementAndGet(), 
				"Hello, " + name);
	}
}
