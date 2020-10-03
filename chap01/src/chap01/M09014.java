package chap01;

public class M09014 {
	public static void main(String[] args) {
		무기 a칼 = new 칼();
		a칼.gogo();
	}
}

class 무기 {
	void gogo() {
		System.out.println("적진을 향해 돌격합니다.");
	}
}

class 칼 extends 무기 {
	
}