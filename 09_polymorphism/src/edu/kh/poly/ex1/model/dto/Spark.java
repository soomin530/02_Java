package edu.kh.poly.ex1.model.dto;

public class Spark extends Car{ // 경차
	
	private double discountOffer; // 할인 혜택
	
	public Spark() {} // 기본생성자

	// 매개변수생성자 + 상속받은 것도 포함
	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}

	// getter / setter
	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString() + "/ " + discountOffer;
	}

}
