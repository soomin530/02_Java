package com.hw2.model.dto;

public abstract class Monkey extends Animal {
	
	public Monkey() {}

	public Monkey(String name) {
		super(name);
	}
	
	public abstract void sound();
	

}
