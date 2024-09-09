package com.kh.practice.snack.model.vo;

public class Snack {
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;

	// 기본생성자
	public Snack() {
		
	}

	// 매개변수 있는 생성자
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}

	// 저장된 데이터를 불러오는 메서드
	// 데이터를 변수에 저장하는 메서드
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 담긴 데이터를 리턴하는 메서드
	public String information() {
		return kind + "(" + name + "-" + flavor + ") " + numOf + "개 " + price + "원";
		// 저장한 정보 확인 y 눌렀을 때 출력될 데이터
	}

	
	
}
