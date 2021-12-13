package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplierController {

	@Autowired
	private OperationService operationService = new OperationService();
	
	AtomicLong id = new AtomicLong();
	
	@GetMapping("/multiply") 
	public Result multiply(int n, int m) {
		return operationService.multiply(id, n, m);
	}
	
}
