package edu.kh.oop.cls.model.service;

import edu.kh.oop.practice.model.service.BookService;
import edu.kh.oop.practice.model.service.HeroService;

public class PracticeRun {

	public static void main(String[] args) {
		
		//BookService bs = new BookService();
		//bs.practice();
		// 클래스 안에 생성자가 하나도 없다면
		// 컴파일러가 기본생성자는 자동으로 만들어줌
		// -> 그래서 우리가 BookService() 이렇게 사용 가능한거다!
		// -> 생성자가 하나라도 있으면 기본생성자 자동으로 생성 X
		// -> 매개변수생성자 만들었다면, 기본생성자 개발자가 만들어야함

		
		HeroService hs = new HeroService();
		hs.practice();
	}

}