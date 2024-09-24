package com.hw2.model.dto;

public abstract class Animal {
	
	protected String name;
	
	// 기본생성자
	public Animal() {}

	// 매개변수생성자
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public abstract void sound();

}
