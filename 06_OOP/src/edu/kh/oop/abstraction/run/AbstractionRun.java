package edu.kh.oop.abstraction.run;

import edu.kh.oop.abstraction.model.service.AbstractionService;

public class AbstractionRun {
	public static void main(String[] args) {
		
		// 서비스 클래스 객체 생성
		AbstractionService as = new AbstractionService();
		as.ex1(); // 생성한 객체에서 ex1() 호출
	}

}
