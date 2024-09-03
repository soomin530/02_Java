package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		 * 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 짝수
		 * 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		 * 
		 * [실행 화면]
		 * 1 2 3 4 5 6 7 8 9
		 * 짝수 번째 인덱스 합 : 25
		 * 
		 */

		int[] arr = new int[9];
		// [0,0,0,0,0,0,0,0,0]
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;

			if (i % 2 == 0) {

				sum += arr[i];
			}
			System.out.print(arr[i] + " ");
		}

		System.out.print("\n짝수 번째 인덱스 합 : " + sum);
	}

	public void practice2() {
		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
		 * 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		 * "홀수 번째" 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		 * 
		 * [실행 화면]
		 * 9 8 7 6 5 4 3 2 1
		 * 홀수 번째 인덱스 합 : 20
		 * 
		 */

		int[] arr = new int[9];
		int sum = 0;

		for (int i = arr.length; i > 0; i--) {
			arr[i] = i - 1;

			if (i % 2 != 0) {
				sum += arr[i];
			}
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}

	public void practice3() {
		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		 * 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		 * 
		 * [실행 화면]
		 * 양의 정수 : 5
		 * 1 2 3 4 5
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];

		for (int i = 1; i < arr.length + 1; i++) {
			System.out.print(i + " ");
		}
	}

	public void practice4() {
		/*
		 * 정수 5개를 입력 받아 배열을 초기화 하고
		 * 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
		 * 배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		 * 
		 * [실행 화면 1]
		 * 입력 0 : 5
		 * 입력 1 : 8
		 * 입력 2 : 9
		 * 입력 3 : 10
		 * 입력 4 : 4
		 * 검색할 값 : 8
		 * 인덱스 : 1
		 * ----------------
		 * [실행 화면 2]
		 * 입력 0 : 5
		 * 입력 1 : 8
		 * 입력 2 : 9
		 * 입력 3 : 10
		 * 입력 4 : 4
		 * 검색할 값 : 1
		 * 일치하는 값이 존재하지 않습니다.
		 * 
		 */

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			System.out.println("입력" + i + ":" + input);
		}
	}

	public void practice5() {
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를
		 * 출력하세요.
		 * 
		 * [실행 화면]
		 * 문자열 : application
		 * 문자 : i
		 * application에 i가 존재하는 위치(인덱스) : 4 8
		 * i 개수 : 2
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String input = sc.nextLine();

		char[] arr = new char[input.length()]; // 내가 입력한 문자 길이 수만큼 배열 만듦

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i); // 각 index에 있는 문자를 문자형으로 반환?
		}

		System.out.println(Arrays.toString(arr));

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0); // String의 0번째 인덱스 문자 하나를 추출해서 char 형태로 반환
		System.out.println(input + "에 " + ch + "가 존재하는 위치(인덱스) : ");

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				count++;
			}
		}

		System.out.println(ch + "개수 : " + count);
	}

	public void practice6() {
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		 * 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 * 
		 * [실행 화면]
		 * 정수 : 5
		 * 배열 0번째 인덱스에 넣을 값 : 4
		 * 배열 1번째 인덱스에 넣을 값 : -4
		 * 배열 2번째 인덱스에 넣을 값 :
		 * 3 배열 3번째 인덱스에 넣을 값 : -3
		 * 배열 4번째 인덱스에 넣을 값 : 2
		 * 4 -4 3 -3 2
		 * 총 합 : 2
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();

		int[] num = new int[input];

		int sum = 0;

		String result = "";
		for (int i = 0; i < num.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			num[i] = sc.nextInt();
			sum += num[i];
			result += num[i] + " ";
		}

		System.out.println(result);
		System.out.println("총 합 : " + sum);
	}

	public void practice7() {

		// 주민등록번호 번호를 입력 받아 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.
		/*
		 * [실행 화면]
		 * 주민등록번호(-포함) : 123456-1234567
		 * 123456-1******
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		int num = sc.nextInt();
	}

	public void practice8() {
		/*
		 * 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		 * 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		 * 다시 정수를 받도록 하세요.
		 * 
		 * [실행 화면]
		 * 정수 : 4
		 * 다시 입력하세요.
		 * 정수 : -6 다시 입력하세요.
		 * 정수 : 5
		 * 1, 2, 3, 2, 1
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();

		int[] num = new int[input];

		if (input % 2 == 0 || input < 3) { // 잘못 입력한 경우
			System.out.println("다시 입력하세요");

		} else { // 잘 입력한 경우
			for (int i = 0; i < num.length; i++) {

			}
		}

	}

	public void practice9() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		 * 
		 * [실행 화면]
		 * 발생한 난수 : 9 7 6 2 5 10 7 2 9 6
		 * 
		 */

		int[] arr = new int[10];
		System.out.print("발생한 난수 : ");

		for (int i = 0; i < arr.length; i++) {

			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;
			System.out.print(arr[i] + " ");

		}

	}

	public void practice10() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		 * 
		 * [실행 화면]
		 * 발생한 난수 : 5 3 2 7 4 8 6 10 9 10
		 * 최대값 : 10
		 * 최소값 : 2
		 * 
		 */

		int[] arr = new int[10];
		System.out.print("발생한 난수 : ");

		for (int i = 0; i < arr.length; i++) {

			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;
			System.out.print(arr[i] + " ");

		}

		System.out.println();

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void practice11() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		 * 
		 * [실행 화면]
		 * 4 1 3 6 9 5 8 10 7 2
		 * 
		 */

		// 1) 정수 10개를 저장할 배열 선언 및 할당
		int[] arr = new int[10];

		// 2) 생성된 배열을 처음부터 끝까지 순차 접근하는 for 문 작성
		for (int i = 0; i < arr.length; i++) {

			// 3) 1 ~ 10 사이 난수 생성
			int random = (int) (Math.random() * 10 + 1);

			// 4) 생성된 난수를 순서대로 배열 요소에 대입
			arr[i] = random;

			// 5) 중복 검사를 위한 for 문 작성
			for (int x = 0; x < i; x++) {

				// 6) 현재 생성된 난수와 같은 수가
				// 앞쪽 요소에 있는지 검사
				if (random == arr[x]) {

					i--;
					// i가 1씩 증가할 때마다 난수가 하나 생성
					// -> 중복 값이 있으면 난수를 새로 하나 더 생성해야 함
					// -> i 값을 인위적으로 1 감소시켜서 난수 발생의 기회를 한 번 더 줌
					break;
					// 앞쪽에서 중복 데이터를 발견하면
					// 남은 값을 비교할 필요가 없다
					// -> 효율 향상을 위해 중복 검사하는 for 문 종료
				}
			}
		}
		// 결과 출력
		System.out.println(Arrays.toString(arr));
	}

	public void practice12() {
		/*
		 * 로또 번호 자동 생성기 프로그램을 만들기.
		 * (중복 값 없이 오름차순으로 정렬하여 출력하세요.)
		 * 
		 * [실행 화면]
		 * 3 4 15 17 28 40
		 * 
		 */

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {

			int random = (int) (Math.random() * 45 + 1);

			lotto[i] = random;

			for (int x = 0; x < i; x++) {

				if (random == lotto[x]) {

					i--;
					break;
				}
			}
		}

		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

	public void practice13() {
		/*
		 * 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		 * 문자의 개수와 함께 출력하세요.
		 * 
		 * [실행 화면]
		 * 문자열 : application
		 * 문자열에 있는 문자 : a, p, l, i, c, t, o, n
		 * 문자 개수 : 8
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String input = sc.nextLine();

		char[] arr = new char[input.length()]; // 내가 입력한 문자 길이 수만큼 배열 만듦

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i); // 각 index에 있는 문자를 문자형으로 반환?
		}

		System.out.println(Arrays.toString(arr));

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0); // String의 0번째 인덱스 문자 하나를 추출해서 char 형태로 반환
		System.out.println(input + "에 있는 문자 " + ch + "가 존재하는 위치(인덱스) : ");

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				count++;
			}
		}

		System.out.println(ch + "개수 : " + count);
	}

	public void practice14() {
		/*
		 * 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		 * 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		 * 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		 * 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		 * 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		 * 
		 * [실행 화면]
		 * 배열의 크기를 입력하세요 : 3
		 * 1번째 문자열 : 자바의 정석
		 * 2번째 문자열 : 알고리즘
		 * 3번째 문자열 : C프로그래밍
		 * 더 값을 입력하시겠습니까?(Y/N) : y
		 * 더 입력하고 싶은 개수 : 2
		 * 4번째 문자열 : 인간관계
		 * 5번째 문자열 : 자기계발
		 * 더 값을 입력하시겠습니까?(Y/N) : y
		 * 더 입력하고 싶은 개수 : 1
		 * 6번째 문자열 : 영단어600
		 * 더 값을 입력하시겠습니까?(Y/N) : n
		 * [자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
		 * 
		 */
	}
}
