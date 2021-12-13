package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class OperationService {

	public Result multiply(AtomicLong id, int n, int m) {
		return new Multiplier(id.incrementAndGet(), n, m).getProduct();
	}
	 
	public Result add(AtomicLong id, int n, int m) {
		return new Adder(id.incrementAndGet(), n, m).getSum();
	}
	
}
