package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		/*
		 * 키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
		 * 짝수가 아니면 “홀수입니다.“를 출력하세요.
		 * 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		 */
		
		System.out.println("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input <= 0) {
			System.out.println("양수만 입력해주세요");
		} else if(input %2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		} 
	}

	public void practice2() {
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		 * 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		 * (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)*/
		
		System.out.print("국어점수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int input2 = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int input3 = sc.nextInt();
		
		int sum = input1 + input2 + input3;

		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %d\n", sum / 3.0);
		
		// if(input1 < 40 && input2 < 40 && input3 < 40) {
		// System.out.println("불합격입니다."); return;
		// }
		
		if(input1 < 40) {
			System.out.println("불합격입니다."); return;
			
		} else if(input2 < 40) {
			System.out.println("불합격입니다."); return;
			
		} else if(input2 < 40) {
			System.out.println("불합격입니다."); return;
		}
		
		
		if(sum / 3.0 > 60 && sum / 3.0 <= 100) {
			System.out.println("축하합니다, 합격입니다!");
			
		} else {
			System.out.println("불합격입니다.");
		}
	
	}

	public void practice3() {
		/*
		 * 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
		 * 잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)
		 * */
		
//		System.out.println("1 ~ 12 사이의 정수 입력 : "); 
//		int num = sc.nextInt();
//		
//			switch(num) {
//				
//				case1: case3: case5: case7: case8: case10: case12:
//					System.out.println(num + "월은 31일까지 있습니다."); break;
//				
//				case4: case6: case9: case11:
//					System.out.println(num + "월은 30일까지 있습니다."); break;
//					
//				case2:
//					System.out.println(num + "월은 28일까지 있습니다.");
//				
//				default: System.out.println(num + "월은 잘못 입력된 달입니다.");
//				
//			}
		}

	public void practice4() {
		/*
		 * 키, 몸무게를 double 로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		 * 저체중/정상체중/과체중/비만을 출력하세요.
		 */
		
		/*
		 * BMI = 몸무게 / (키(m) * 키(m))
		 * BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		 * BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		 * BMI가 30이상일 경우 고도 비만
		 * */
		
		System.out.println("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		// BMI = 몸무게 / (키(m) * 키(m))
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		
		// BMI가 18.5미만일 경우 저체중
		// 18.5이상 23미만일 경우 정상체중
		// BMI가 23이상 25미만일 경우 과체중
		// 25이상 30미만일 경우 비만
		
		String result;
		
		if(bmi < 18.5) {
			result = "저체중";
		} else if(bmi < 23) {
			result = "정상체중";
		} else if(bmi < 25) {
			result = "과체중";
		} else if(bmi < 30) {
			result = "비만";
		} else {
			result = "고도비만";	
		}
		
		System.out.println(result);
	}

	public void practice5() {
		/*
		 * 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail 을 출력하세요.
		 * 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		 * 이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		 * 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail 을 출력하세요.
		 */
	}
}
