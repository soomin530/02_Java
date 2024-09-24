package com.hw1.model.dto;

public class Friend {
	
	// 필드
	private String name;
	
	// 기본생성자
	public Friend() {}
	
	// 매개변수생성자
	public Friend(String name) {
		this.name = name;
	}
	
	// 메서드
	public void pickLeader() {
		System.out.println(name + "가 떡잎방범대 대장이다 !");
	}
	 
	
	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
