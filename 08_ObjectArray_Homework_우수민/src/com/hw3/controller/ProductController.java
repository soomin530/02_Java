package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	
	private Product[] pro = null;
	public static int count = 0; // 클래스명.변수명
	
	Scanner sc = new Scanner(System.in);
	{
		pro = new Product[10];
		// 초기화 블럭
		// 객체 생성 시 초기화 블럭 수행 -> 생성자 수행
	}
	
	public void mainMenu() {
		// do~while 문을 이용하여 반복적으로 메뉴화면 출력
		// 각 버튼 선택 시 각각의 메소드 호출
		
		int menu = 0;
		
		do {
				System.out.println("===== 제품 관리 메뉴 =====");
				System.out.println("1. 제품 정보 추가");
				System.out.println("2. 제품 전체 조회");
				System.out.println("0. 프로그램 종료");
				System.out.print("메뉴 선택 : ");
				menu = sc.nextInt();
				
				switch(menu) {
				
				case 1 : productInput(); break;
				case 2 : productPrint(); break;
				case 0 : System.out.println("프로그램 종료.."); break;
				default : System.out.println("잘못입력함. 다시입력해라");
			}
				
			
		} while(menu != 0);
	}
	
	public void productInput() {
		// 새로운 제품 정보 기록을 위해 키보드로 정보들을 입력 받아
		// 객체를 생성하고 현재 카운트 인덱스에 주소 저장

		System.out.print("제품 번호 : ");
		int pId = sc.nextInt();
		
		sc.nextLine(); // 입력버퍼에 있는 개행문자 제거
		
		System.out.print("제품 이름 : ");
		String pName = sc.nextLine();
		
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		pro[count] = new Product(pId, pName, price, tax);
		
	}
	public void productPrint() {
		// 현재까지 기록된 도서 정보 모두 출력
		
		for(int i=0; i < count; i++) {
			System.out.println( pro[i].information() );
		}
	}
}
