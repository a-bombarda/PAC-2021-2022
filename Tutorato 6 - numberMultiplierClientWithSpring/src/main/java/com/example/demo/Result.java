package com.example.demo;

public class Result {
	int result;
	
	public Result() {
		result = 0;
	}
	
	public Result(int result) {
		this.result = result;
	}
	
	public int getResult() {
		return result;
	}
	
	public void setResult(int result) {
		this.result = result;
	}
	
	public String toString() {
		return "[Result]: " + result;
	}
}
