package kh.test.model.vo;

public class Student {

	private String name;
	private int score;
	
	public Student() {}
	

	public Student(String name, int score) { // 매개변수생성자 추가
		super();
		this.name = name;
		this.score = score;
	}



	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return String.format("%s 학생의 점수 : %d점", name, score); // toString형태 바꾸기
	}
	

	
}


	
	


