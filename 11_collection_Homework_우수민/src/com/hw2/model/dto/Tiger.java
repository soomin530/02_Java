package com.hw2.model.dto;

public abstract class Tiger extends Animal {
	
	// 기본생성자
	public Tiger() {}

	// 매개변수생성자
	public Tiger(String name) {
		super(name);
	}
	
	public void sound() {
		System.out.println(name + "가 어흥하며 포효합니다.");
	}
}
