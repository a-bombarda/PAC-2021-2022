package com.example.demo;

public class Greetings {
	private final long id;
	private final String content;
	
	public Greetings(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}

	public String toString() {
		return "[ID]: " + id + "\t[CONTENT]: " + content;
	}
}
