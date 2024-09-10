package com.hw1.model.vo;

public class Student extends Person{ // 자식
	
	private int grade;
	private String major;
	
	// 기본생성자
	public Student() {}

	// 매개변수생성자
	// - name 값은 부모 필드 값에 직접 접근해서 초기화
	// - age, height, weight 는 부모 생성자를 통해 초기화
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		// Person(부모) 필드에 직접 접근
		this.grade = grade;
		this.major = major;
		
	}

	// getter / setter
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String information() {
		return super.information() + 
				String.format(" / 학년 : %d / 전공 : %s", 
						grade, major); 
		
		// -> "이름 : 홍길동 / 나이 : 20 / 신장 : 180 / 몸무게 : 80 / 학년 : 3 / 전공 : 경영"
	}

}
