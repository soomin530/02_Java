package com.hw1.model.dto;

public class Textbook extends Book{
	
	private String subject; // 과목
	
	// 기본생성자
	public Textbook() {}

	// 매개변수생성자
	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}
	
	// getter / setter
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void displayInfo() {
		System.out.printf("[전문 서적]  제목 : %s / 저자 : %s / 과목 :  %s", getTitle(), getAuthor(), subject);
	}

}
