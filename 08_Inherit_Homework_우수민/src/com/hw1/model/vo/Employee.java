package com.hw1.model.vo;

public class Employee extends Person{ // 자식
	
	private int salary;
	private String dept;
	
	// 기본생성자
	public Employee() {}

	// 매개변수생성자
	// - name 값은 부모 필드 값에 직접 접근해서 초기화
	// - age, height, weight 는 부모 생성자를 통해 초기화
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		// Person(부모) 필드에 직접 접근
		this.salary = salary;
		this.dept = dept;
	}
	
	// getter / setter
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
		public String information() {
		// -> "이름 : 홍길동 / 나이 : 20 / 신장 : 180 / 몸무게 : 80"
			return super.information() + 
					String.format(" / 급여 : %d / 부서 : %s", 
							salary, dept); 
		}

}
