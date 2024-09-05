package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		
		// 기본생성자
		// 매개변수 생성자를 이용해
		// 2개의 Book 객체 생성 후 toString()을 이용해 필드 정보 출력
		Book b1 = new Book();
		
		Book b2 = new Book();
		
		b2.setTitle("자바의 정석");
		b2.setPrice(30000);
		b2.setDiscountRate(0.2);
		b2.setAuthor("남궁성");
		
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println("=================================");
		
		// setter 메서드 이용하여
		// 첫 번째 객체 값 수정 후 필드 정보 출력
		System.out.println("수정된 결과 확인");
		
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("홍길동");
		
		System.out.println(b1.toString());
		
		// getter 메서드 이용하여 
		// 각 객체 할인율 적용한 책 가격 계산해서 출력
		// -> 할인된 가격 = 가격 - (가격 * 할인율)
		
		System.out.println("=================================");
		
		System.out.printf("도서명 = %s\n", b1.getTitle());
		System.out.printf("할인된 가격 = %d\n", (int)(b1.getPrice() * b1.getDiscountRate()));
		
		System.out.printf("도서명 = %s\n", b2.getTitle());
		System.out.printf("할인된 가격 = %d\n", (int)(b2.getPrice() * b2.getDiscountRate()));
	}

}

/*
 * 현실 객체 : 자신의 속성(값, data)과 기능(동작, 행동)이 다른 것들과 구분되어 식별 가능한 것
 * 
 * 객체 지향 언어 : 독립적으로 각각 구분해서 인식할 수 있게끔 하는 것을 목표로 
 * 
 * 자바 객체 : 클래스에 정의된 내용대로 new 연산자를 통해 메모리 영역에 생성된 것
 * 
 * class : 객체의 특성(속성, 기능)에 대한 정의를 한 것
 * 
 * new 연산자 : 객체 생성
 * 
 * 추상화 : 과자에 대한 프로그램을 만들 때 과자의 공통된 코드만 작성하는 것
 * 
 * 캡슐화 : 추상화를 통해 정리된 데이터들과 기능을 하나로 묶어 관리하는 기법
 * 
 * 캡슐화 원칙
 * : 데이터 직접 접근 제한을 원칙으로 하여
 *   클래스의 멤버 변수에 대한 접근 권한은 private 을 원칙으로 함
 *   직접 접근을 못하기 때문에 클래스 내부에 간접 접근 방법을 제공하는 기능(메서드) 작성해둠
 *   
 * 메서드 / 기능의 '정의'란 ? :
 * 
 * 메서드의 '호출'이란 ? :
 * 
 * return : 해당 메서드를 종료하고 자신을 호출한 메서드로 돌아가는 예약어
 * 
 * public String ex1() {
 * 		return "Hi"
 * }
 * 
 *
 * 위 메서드 상세히 해석 :  
 * 

 * 
 * */
