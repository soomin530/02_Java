package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

import com.hw1.model.dto.Friend;

public class Run {
	 public static void main(String[] args) {
		
		 /*
		  * Friend 객체만 넣을 수 있는 ArrayList 객체 생성 후
		  * 짱구, 철수, 유리, 훈이, 맹구 객체 생성하여 ArrayList에 추가하기
		  * 
		  * List에서 다섯 객체 중 랜덤으로 하나를 뽑아
		  * 골목대장이 누군지 출력하기
		  * 
		  * [ 짱구가 떡잎방범대 대장이다 ! ]
		  * 
		  * */
		 
		 // Friend 객체만 넣을 수 있는 ArrayList 객체 생성
		 List<Friend> friendList = new ArrayList<Friend>();
		 
		 // 짱구, 철수, 유리, 훈이, 맹구 객체 생성하여 ArrayList에 추가
		 friendList.add(new Friend("짱구"));
		 friendList.add(new Friend("철수"));
		 friendList.add(new Friend("유리"));
		 friendList.add(new Friend("훈이"));
		 friendList.add(new Friend("맹구"));
		 
		 // List에서 다섯 객체 중 랜덤으로 하나 뽑기
		 Random random = new Random();
		 
		 friendList.get(random.nextInt(friendList.size()) ).pickLeader();
			 
		 }
	}
