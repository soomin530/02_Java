package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone { // 자식
	
	private boolean hasPhysicalKeyboard; // 물리적 키보드 유무
	
	// 기본생성자
	public BasicPhone() {}

	// 매개변수생성자
	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	// getter / setter
	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	public void checkKeyboard() {
		
		if(hasPhysicalKeyboard) { // 물리적 키보드가 존재한다면
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다. ");
		
		} else {  // 물리적 키보드가 존재하지 않는다면
			System.out.println("이 휴대폰은 물리적 키보드가 없습니다. ");
			
		}
		
		
	}
	

}
