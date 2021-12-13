package com.example.demo;

public class Moltiplicatore {
	int num1;
	int num2;
	
	public Moltiplicatore(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Result getProduct() {
		return new Result(num1 * num2);
	}
}
