package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {
	public static void main(String[] args) {
		// Book 객체배열 3칸 생성 후 각 인덱스마다
		// Novel, TextBook, Poetry 생성하여 대입
		// 모든 도서 정보 출력
	
		
		// Novel, Textbook, Poetry(자식 객체) 생성
		Novel n1 = new Novel();
		n1.setTitle("해리포터");
		n1.setAuthor("J.K.롤링");
		n1.setGenre("판타지");
		
		
		Textbook t1 = new Textbook();
		t1.setTitle("자바 프로그래밍");
		t1.setAuthor("James Gosling");
		t1.setSubject("컴퓨터 과학");
		
		
		Poetry p1 = new Poetry();
		p1.setTitle("우리들의 사랑시");
		p1.setAuthor("김소월");
		p1.setNumberOfPoems(30);
		
		Book b1 = new Novel();
		Book b2 = new Textbook();
		Book b3 = new Poetry();
		
		Book[] book = new Book[3];
		
		book[0] = new Novel();
		book[1] = new Textbook();
		book[2] = new Poetry();
		

	}

}
