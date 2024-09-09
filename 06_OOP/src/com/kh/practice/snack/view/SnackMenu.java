package com.kh.practice.snack.view;

// view : 사용자에게 보여줄 응답 화면과 관련된 코드가 모인 패키지
import java.util.Scanner;
import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	// 필드
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	// 사용자가 Snack 객체에 데이터를 저장할 수 있도록 값을 받고
	// 저장한 값을 출력하는 메서드
	public void menu() {
		
		System.out.println("스낵류를 입력하세요");
		System.out.print("종류 : ");
		String kind = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("맛 : ");
		String flavor = sc.next();
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		
		String result = sc.next(); // y or n
		
		if(result.equals("y")) { // y를 입력했을 때
			System.out.println(scr.confirmData()); /*saveDate에 입력한 값 반환*/ 
					
		} 
		
	}

}
