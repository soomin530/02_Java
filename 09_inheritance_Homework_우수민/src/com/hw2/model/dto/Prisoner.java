package com.hw2.model.dto;

public class Prisoner extends Person {
	
	private String crime;
	
	public Prisoner() {}

	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}
	
	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	@Override
	public String getInfo() {
		return String.format("ID : %s, 이름 : %s, 죄목 : %s", id, name, crime);
		// id 와 name을 Person에서 Protencted로 만들었기 때문에
		// 후손 클래스에서 직접 접근 가능하다 ! (super 없어도 됨);
	}

}
