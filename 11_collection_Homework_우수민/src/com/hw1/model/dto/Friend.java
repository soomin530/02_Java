package com.hw1.model.dto;

public class Friend {
	
	private String name;
	
	// 기본생성자
	public Friend() {}

	// 매개변수생성자
	public Friend(String name) {
		super();
		this.name = name;
	}
	
	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void pickLeader() {
		
	}

}
