package edu.kh.op.practice.run;

import java.util.Scanner;

public class OperatorPractice3 {
	public void practice1() {
		/*
		 * 마트에서 고객에게 할인 혜택을 제공하려고 한다
		 * 물건의 총 가격과 회원 여부를 입력받아, 
		 * 회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라
		 * */
	}


	public void practice2() {
		/*
		 * ATM에서 사용자가 원하는 금액을 입력하면,
		 * 5만원, 1만원, 5천원, 1천원 단위로최소 개수의 지폐로 돈을 인출하라
		 * 
		 * ex) 사용자가 123000원을 입력하면,
		 * 5만원 지폐 2장, 1만원 지폐 2장, 5천원 지폐 0장, 1천원 지폐 3장이 필요함
		 * */
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("출금할 금액 입력 : ");
			int amount = sc.nextInt();
			
			int fiftyThousand = amount / 50000;
			amount %= 50000;
			
			int tenThousand = amount / 10000;
			amount %= 10000;
			
			int fiveThousand = amount / 5000;
			amount %= 5000;
			
			
			int oneThousand = amount / 1000;
			
			System.out.println("50000원 : " + fiftyThousand );
			System.out.println("10000원 : " + tenThousand );
			System.out.println("5000원 : " + fiveThousand );
			System.out.println("1000원 : " + oneThousand );
			
			
		}
	}

