package com.hw1.model.dto;

public class Novel extends Book{
	private String genre; // 장르
	
	// 기본생성자
	public Novel() {}
	

	// 매개변수생성자
	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}

	// getter / setter
	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public void displayInfo() {
		System.out.println("[소설]  제목 : " + super.getTitle() + " /  " + "저자 : " + author + " / " + "장르 : " + genre);
		
		
	}
	
	

}
