package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun {
	public static void main(String[] args) {
		
		MemberService ms = new MemberService();
		// MemberService의 기본 생성자가 작성되어있지 않지만
		// 컴파일러가 코드를 번역할 때
		// 클래스 내부에서 생성자가 하나도 없다면
		// 자동으로 기본생성자를 추가해주기 때문에 (기본생성자만)
		// 문제 없이 사용 가능 !
		
		// ** 주의사항 **
		// 만약에 생성자가 하나라도 있으면 자동생성 안 해준다 !
		ms.displayMenu();
	}

}
