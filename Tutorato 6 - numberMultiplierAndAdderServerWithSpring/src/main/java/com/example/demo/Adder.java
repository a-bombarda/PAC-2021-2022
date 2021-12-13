package com.example.demo;

public class Adder {
	long id;
	int number1;
	int number2;
	
	public Adder(long id, int number1, int number2) {
		this.id = id;
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public Result getSum() {
		return new Result(number1 + number2);
	}
}
