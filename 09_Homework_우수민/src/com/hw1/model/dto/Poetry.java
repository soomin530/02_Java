package com.hw1.model.dto;

public class Poetry extends Book{
	
	private int numberOfPoems; // 시 수
	
	// 기본생성자
	public Poetry() {}
	
	// 매개변수생성자
	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}
	
	// getter / setter
	public int getNumberOfPoems() {
		return numberOfPoems;
	}

	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}

	@Override
	public void displayInfo() {
		System.out.printf("[시집]  제목 : %s / 저자 : %s / 시 수 :  %d", getTitle(), getAuthor(), numberOfPoems);
		
	}
	
	

}
