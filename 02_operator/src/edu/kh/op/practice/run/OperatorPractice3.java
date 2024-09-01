package edu.kh.op.practice.run;

import java.util.Scanner;

public class OperatorPractice3 {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		/*
		 * 마트에서 고객에게 할인 혜택을 제공하려고 한다
		 * 물건의 총 가격과 회원 여부를 입력받아, 
		 * 회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라
		 * */
		
		System.out.print("가격을 입력하세요 : ");
		double money = sc.nextDouble();
		
		System.out.print("멤버십 있으세요 ? (있으면 true / 없으면 false를 입력) : "); 
		// boolean 써서 true시 10%, false시 5% 할인
		
		boolean membership = sc.nextBoolean();
		double discount = membership ? money * 0.10 : money * 0.05;
		
		double finalmoney = money - discount;
		
		// 할인된 금액 출력
		System.out.print("할인을 포함한 최종 금액 : " + finalmoney + "원");
		
		
		
	}


	public void practice2() {
		/*
		 * ATM에서 사용자가 원하는 금액을 입력하면,
		 * 5만원, 1만원, 5천원, 1천원 단위로최소 개수의 지폐로 돈을 인출하라
		 * 
		 * ex) 사용자가 123000원을 입력하면,
		 * 5만원 지폐 2장, 1만원 지폐 2장, 5천원 지폐 0장, 1천원 지폐 3장이 필요함
		 * */
		
		System.out.print("출금할 금액 입력 : ");
		int out = sc.nextInt();
		
		int fit = out / 50000;
		out %= 50000;
		
		int ten = out / 10000;
		out %= 10000;
		
		int fiv = out / 5000;
		out %= 5000;
		
		int one = out / 1000;
		
		System.out.println();
		
		System.out.println("5만 원 : " + fit + "장");
		System.out.println("만 원 : " + ten + "장");
		System.out.println("5천 원 : " + fiv + "장");
		System.out.println("천 원 : " + one + "장");
			
			
		}

	public void practice3() {
		
		System.out.println("첫 번째 수 : ");
		int first = sc.nextInt();
		
		System.out.println("두 번째 수 : ");
		int second = sc.nextInt();
		
		String result = first % second == 0 ? "배수입니다." : "배수가 아닙니다.";
		
		System.out.println(result);
		
	}
}

