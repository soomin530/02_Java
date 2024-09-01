package edu.kh.op.ex;

import java.util.Scanner;

public class OpExample { // 예제 코드 작성용 클래스

	// ex1() method : 객체 지향 프로그래밍에서 OpExample 객체와 관련된 함수
	// -> OpExample이 가지고 있는 기능 중 ex1() 이라는 기능
	public void ex1() { // <- 이게 메서드 !
		// 증감(증가, 감소) 연산자 : ++, --
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		
		System.out.println("iNum1 : " + iNum1); // 11
		System.out.println("iNum2 : " + iNum2); // 9
		
		// 전위연산
		int temp1 = 5;
		
		System.out.println(++temp1 + 5); // 11
		//                     6   + 5
		
		// 후위연산
		int temp2 = 3;
		System.out.println(temp2-- + 2); // 5
		//                   3 + 2 -> 5
		//                   3-- -> 2
		System.out.println(temp2);
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		//      3++ + --5
		//      3++ +   4
		//  c = 7
		//      3++ -> 4
		
		// 최종적으로 a, b, c 는 각각 얼마?
		System.out.printf("%d / %d / %d\n", a, b, c);
		                  // 4 / 4 / 7
	}

	public void ex2() {
		// 비교 연산자 : >, <, >=, <=, ==, !=
		// - 비교 연산자의 결과는 항상 논리값 (true / false)
		
		int a = 10;
		int b = 20;
		
		System.out.println((a == b) == false); // true
		//                   false  == false  ->  true
		
		int c = 4;
		int d = 5;
		
		System.out.println((++c != d) == (--c != d)); // false
		//                  ++4(5) != 5 -> false
		//                              --5(4) != 5 -> true
		//                    false == true
		//                   --> false
		
	}


	public void ex3() {
		// 논리 연산자 : &&(AND), || (OR)
		
		// &&(AND) : 둘 다 true 면 true, 나머지는 false
		// = 와~, 그리고, ~면서, ~부터, ~까지, ~사이
		
		int a = 101;
		
		// a는 100 이상이면서 짝수인가?
		System.out.println( (a >= 100) && (a % 2 == 0) ); // false
		
		int b = 5;
		
		// b는 1부터 10까지 숫자 범위에 포함되어 있는가?
		// 1 ~ 10 -> b는 1보다 크거나 같으면서, 10보다 작거나 같다
		
		System.out.println( (b >= 1) && (b <= 10) ); // true
		
		// ||(OR) : 둘 다 false 면 false, 나머지는 true
		// 또는, ~ 거나
		
		int c = 10;
		
		// c는 10을 초과하거나 짝수인가?
		System.out.println( (c > 10) || (c % 2 == 0) ); // true
		
		
		
		
		
		
	}


	public void ex4() {
		// 삼항 연산자 : 조건식 ? true 수행될 값 : false 수행될 값
		
		// * 조건식 : 연산 결과 boolean 값 (true / false인 식)
		
		int num = 30;
		
		// num 이 30보다 크면(초과하면) "num 은 30보다 큰 수이다" 출력
		// 아니면 "num 은 30 이하의 수이다" 출력
		
		String result = num > 30 ? "num 은 30보다 큰 수이다" : "num 은 30 이하의 수이다";
		
		System.out.println(result);
		
		System.out.println("---------------------------------------------------------");
		
		// 입력 받은 정수가 음수인지 양수인지 구분
		// 단, 0은 양수로 처리
		
		// ex)
		// 정수 입력 : 4 -> 양수입니다. 출력
		// 정수 입력 : -5 -> 음수입니다. 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		
		int input = sc.nextInt();
		
		String result2 = input >= 0 ? "양수입니다." : "음수입니다.";
		
		System.out.println(result2);
		
		
		
		
		

		
	}

}
