package com.hw3.model.vo;

public class Product {
	private int pld;
	private String pName;
	private int price;
	private double tax;
	
	// Product의 기본 생성자 및 매개변수 생성자로 Product 객체
	// 생성시 마다 ProductController 객체 수 카운트를 1 증가
	
	
	public Product() {}

	public Product(int pld, String pName, int price, double tax) {
		this.pld = pld;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
		
		ProductController.count++;
	}
	
	
	public String information() {
		
	}

	public int getPld() {
		return pld;
	}

	public void setPld(int pld) {
		this.pld = pld;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
