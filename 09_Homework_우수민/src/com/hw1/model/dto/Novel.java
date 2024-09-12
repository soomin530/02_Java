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
		System.out.printf("[소설]  제목 : %s / 저자 : %s / 장르 :  %s", getTitle(), getAuthor(), genre);
		//			          상속 받아서 만들어진 자식은 부모의 값을 super 를 붙이지 않아도 받아올 수 있음
		// 					    ㄴ 하지만 웬만하면 붙여주기 !
		
		
	}
	
	

}
