package edu.kh.poly.ex1.model.dto;

public class Car /*extends Object*/{

	// 속성 (필드)
	private String engine; // 엔진
	private String fuel; // 연료
	private int wheel; // 바퀴 개수
	
	// 기능 (생성자 + 메서드)
	public Car() {} // 기본생성자

	public Car(String engine, String fuel, int wheel) { // 매개변수생성자
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	// getter / setter
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	//Object.toString() 오버라이딩
	@Override // 오버라이딩 했다는 걸 컴파일러에게 알려주는 Override 어노테이션
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
	}
	
}
