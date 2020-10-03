package chap01;

public class M09042 {
	public int a = 100; //어느 클래스든 가능 전체공개
	protected int b = 200; //동일 패키지내에서만 공개. 다른 패키지어도 자식이면 가능
	int c = 300; //default. 동일 패키지내에서만 공개
	private int d = 400; //자기 자신만 접근 가능. 비공개
	
	void Exam() {
		System.out.println(d);
	}
}
