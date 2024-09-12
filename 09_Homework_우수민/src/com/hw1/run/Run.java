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
	
		Book[] book = new Book[3];
		
		book[0] = new Novel("해리포터", "J.K.롤링", "판타지" );
		book[1] = new Textbook("자바 프로그래밍", "James Gosling", "컴퓨터 과학");
		book[2] = new Poetry("우리들의 사랑시", "김소월", 30);
		// 부모타입 참조변수 = 자식객체 (업캐스팅)

		// 모든 도서의 정보 출력
		for(Book books : book) {
			books.displayInfo();
			System.out.println(); // 개행
		}
		
		
		
		
		

	}

}
