package com.example.demo;

public class Greeting {
	private final long id;
	private final String contenuto;
	
	public Greeting(long id, String contenuto) {
		this.id = id;
		this.contenuto = contenuto;
	}
	
	public long getId() {
		return id;
	}
	
	public String getContenuto() {
		return contenuto;
	}
	
	public String toString() {
		return "[ID]: " + id + " [Contenuto]: " + contenuto;
	}
}
