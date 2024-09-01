package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		/*사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 * */
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(i = 1; i <= num; i++) {
				System.out.println(num);
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}

	public void practice2(){
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * */
		
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		for(int i = 1; i <= 1; i++)	{
			System.out.println(num);
		}	
	}

	public void practice3(){
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		
	}

	public void practice4(){
		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 */
		
		System.out.println("첫 번째 숫자 : ");
		System.out.println("두 번째 숫자 : ");
	}

	public void practice5(){
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		
		System.out.println("숫자 : ");
		System.out.println("===== 단 =====");
		
	}

	public void practice6(){
		/*사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		 * 단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
		 * */
		
		System.out.println("숫자 : ");
		
	}

	public void practice7(){
		// 다음과 같은 실행 예제를 구현하세요.
		
		/*
		 * ex.
		 * 정수 입력 : 4
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * 
		 * */
	}

	public void practice8(){
		// 다음과 같은 실행 예제를 구현하세요.
		
		/*
		 * ex.
		 * 정수 입력 : 4
		 * 
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 * */
	}

	public void practice9(){
		// 다음과 같은 실행 예제를 구현하세요.
		
		/*
		 * ex.
		 * 정수 입력 : 4
		 * 
		 *    *
		 *   **
		 *  ***
		 * ****
		 * 
		 * */
	}

	public void practice10(){
		// 다음과 같은 실행 예제를 구현하세요.
		
		/*
		 * ex.
		 * 정수 입력 : 3
		 * 
		 * *
		 * **
		 * ***
		 * **
		 * *
		 * 
		 * */
	}	

	public void practice11(){
		// 다음과 같은 실행 예제를 구현하세요.
		
		/*
		 * ex.
		 * 정수 입력 : 4
		 * 
		 *    *
		 *   ***
		 *  *****
		 * *******
		 * 
		 * */
	}	

	public void practice12(){
		// 다음과 같은 실행 예제를 구현하세요.
		
		/*
		 * ex.
		 * 정수 입력 : 4
		 * 
		 * *****
		 * *   *
		 * *   *
		 * *   *
		 * *****
		 * 
		 * */
	}	

	public void practice13(){
		/*
		 * 1부터 사용자에게 입력 받은 수까지 중에서
		 * 1) 2와 3의 배수를 모두 출력하고
		 * 2) 2와 3의 공배수의 개수를 출력하세요.
		 * */
		
		// ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로
		// 어떤 수를 해당 수들로 나눴을 때 모두 나머지가 0이 나오는 수
		
		System.out.println("자연수 하나를 입력하세요 : ");
		int count = sc.nextInt();
	}
}
