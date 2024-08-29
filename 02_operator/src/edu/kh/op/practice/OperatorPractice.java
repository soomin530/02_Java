package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice { //
	public void practice1() {
	/*
	 메소드 명 : public void practice1(){}
	 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
	 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
	 */		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("인원 수 : ");
		System.out.println("사탕 개수 : ");
		
		int input = sc.nextInt();
		
		// String result = input
		
		
	}

	public void practice2() {
		/*
		/* 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		 * ex.
		 * 이름 : 홍길동
		 * 학년(정수만) : 3
		 * 반(정수만) : 4
		 * 번호(정수만) : 15
		 * 성별(남학생/여학생) : 남학생
		 * 성적(소수점 아래 둘째 자리까지) : 85.75
		 * 3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String input1 = sc.nextLine();
		
		System.out.println("학년 : ");
		int input2 = sc.nextInt();
		
		System.out.println("반 : ");
		int input3 = sc.nextInt();
		
		System.out.println("번호 : ");
		int input4 = sc.nextInt();
		
		System.out.println("성별 : ");
		String input5 = sc.next();
		
		System.out.println("성적 : ");
		double input6 = sc.nextDouble();

		System.out.printf("%d" + "학년 "+  "%d" + "반 " + "%d" + "번 " +"%s %s" +"의 성적은" + " %.2f" + "이다.\n", input2, input3, input4, input1, input2, input6);
		
		
		
	}

	public void practice3() {
		/*
		 * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		 * 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int input7 = sc.nextInt();
		
		System.out.println("영어 : ");
		int input8 = sc.nextInt();
		
		System.out.println("수학 : ");
		int input9 = sc.nextInt();
		
		System.out.printf("d% + d% + d%\n", input7 + input8 + input9);
	}

	public void practice4() {
		/*
		 * 키보드로 나이를 입력받아 
		 * 20세 이상이면 "저는 성인 입니다", 아니면 "저는 미성년 입니다" 출력.
		 * 입력받은 값이 13세 이상이면서 19세 이하면 "청소년입니까? true"출력, 아니면 false 출력
		 * 입력받은 값이 65세 이상이거나, 12세 이하면 
		 * "노인이거나 어린이 입니까? true" 출력 아니면 false 출력
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 나이는 ? : ");
		int input10 = sc.nextInt();	 
		
		String result = input10 >= 20 ? "저는 성인입니다" : "저는 미성년 입니다";
		System.out.println(result);
		
		System.out.println();
		
		System.out.println("청소년 입니까 ? ");
		System.out.println( (input10 >= 13) && (input10 <= 19) );  
		
		System.out.println("노인이거나 어린이 입니까 ? ");
		System.out.println( (input10 >= 65) || (input10 <= 12) );  
	}

}


 