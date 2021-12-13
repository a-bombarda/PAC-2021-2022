package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class OperationService {
	
	public Result moltiplica(int num1, int num2) {
		return new Moltiplicatore(num1, num2).getProduct();
	}
	
}
