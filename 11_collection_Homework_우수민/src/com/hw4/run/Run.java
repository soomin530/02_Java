package com.hw4.run;

import com.hw4.model.service.ToyFactory;

public class Run {
	public static void main(String[] args) {
		
		ToyFactory factory = new ToyFactory();
		factory.displayMenu();
	}

}




/* 메모
 * 
 * List.remove(int index)
 * : index 번호를 알아야 지울 수 있다 (단점)
 *   index 번호를 알기 때문에 정확한 요소 지정하여 삭제 가능
 *
 * List.remove(Object O)
 * : index 번호를 모를 때 사용
 * - 리스트는 중복 요소 허용
 * - 중복된 요소가 있는 경우 처음 발견한 요소 하나만 제거
 *
 * List<Integer> list = new ArrayList<Integer>();
 *
 * list.add(1);  --> 0번 인덱스
 * list.add(2);  --> 1번 인덱스
 *list.add(3);  --> 2번 인덱스
 *
 *list.remove(1); // 1번 인덱스에 있는 요소를 제거 -> 2 제거
 *ㄴ == remove(int index) 
 *
 *list.remove(Integer.valueOf(1)); // 객체 1을 제거
 * ㄴ == remove(Object O)  
 * 
 * */
