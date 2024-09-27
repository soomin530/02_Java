package edu.kh.project.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import edu.kh.project.model.dto.Cafe;
/*
 * 카페 메뉴를 조회하여 손님들에게 메뉴 소개 (조회)
 * 메뉴 번호로 주문 받기
 * 메뉴 추가 및 메뉴 변경이 가능하게 한다 (추가, 수정)
 * 판매 부진한 메뉴 삭제 가능하게 한다 (삭제)
 * */

public class cafeService {
	
		// 필드
		private Scanner sc = new Scanner(System.in);
		
		// 메뉴 저장할 List
		private List<Cafe> drink = new ArrayList<Cafe>(); 
		
		// 주문한 메뉴 저장할 List
		private List<Cafe> order = new ArrayList<Cafe>();
		
		public cafeService() {
			
			// List 에 메뉴 5개 등록
			drink.add(new Cafe("아메리카노", 2080, "콜롬비아 원두", 1));
			drink.add(new Cafe("자몽에이드", 3500, "자몽", 2));
			drink.add(new Cafe("딸기라떼", 4000, "딸기", 3));
			drink.add(new Cafe("히비스커스티", 2500, "히비스커스 꽃잎", 4));
			drink.add(new Cafe("초코스무디", 4000, "초콜릿", 5));
		}
		
		
		// 메서드
		public void displayMenu() {
			
			try {
				
				int menuNum = 0;
			
				do {
					
					System.out.println("*** [ 수민 카페 ] ***");
					System.out.println("1. 메뉴 조회");
					System.out.println("2. 메뉴 주문");
					System.out.println("3. 메뉴 추가");
					System.out.println("4. 메뉴 변경");
					System.out.println("5. 메뉴 삭제");
					System.out.println("0. 프로그램 종료");
					
					System.out.print("\n선택 (번호로 입력해주세요!) : ");
				
					menuNum = sc.nextInt();
					
					switch(menuNum) {
					//case 1 : System.out.println(displayAllMenu()); break;
					case 2 : myOrder(); break;
					case 3 : System.out.println(addMenu()); break;
					case 4 : System.out.println(modifyMenu()); break;
					/* case 5 : System.out.println(removeMenu()); break; */
					case 0 : System.out.println("종료되었습니다."); break;
					default : System.out.println("메뉴에 있는 번호만 입력해주세요.\n"); break;				
					
					}
					
				} while(menuNum != 0);
				
			} catch (Exception e) {
				System.out.println("예외 발생");
				e.printStackTrace(); // 예외 추적
					
			}
		}
	
		
		public void displayAllMenu(List<Cafe> list) {
			
			if(list.isEmpty()) {
				System.out.println("추가한 음료가 없습니다. 음료를 등록해주세요.");
				
			} else {
				for(Cafe temp : list) {
					System.out.println("-- 수민 카페 메뉴 --");
					System.out.println(temp);  

			}
		}
	}
		
		public void myOrder() {
			System.out.println("\n-- 메뉴 주문 --");
			System.out.print("주문하실 음료를 선택해주세요. (번호로 입력해주세요!) : ");
			
			// 현재 메뉴 같이 보여주기
			int orderDrink = sc.nextInt();
			
			boolean flag = true;
			
			// for문 안에 if 문으로 flag false시 주문한 메뉴명 + 주문 성공 출력 띄우기
			// 메뉴판에 없는 메뉴번호 입력 시 메뉴판에 있는 메뉴만 입력해주세요 출력
			
		
		}
		
		public String addMenu() {
			System.out.println("\n-- 메뉴 추가 --");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			System.out.print("메뉴 이름 : ");
			String menuName = sc.next();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
			
			System.out.print("주재료 : ");
			String mainIngredients = sc.nextLine();
			
			Cafe newMenu = new Cafe(menuName, price, mainIngredients, menuNum);
			drink.add(newMenu);
			
			return "등록 완료";
			
		}
		
		public String modifyMenu() {
			// 현재 메뉴판 띄우기
			return "";
			
		}
}
