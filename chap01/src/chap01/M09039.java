package chap01;

public class M09039 {
	public static void main(String[] args) {
		사람 a김철수 = new 김철수();
		a김철수.배달_음식_주문하다();
		
		사람 a김영희 = new 김영희();
		a김영희.배달_음식_주문하다();
	}
}
class 사람 {
	String 이름;
	String 전화번호;
	선호 a좋아하는_음식점;
	String 선호하는_음식의_매운정도;
	String 선호하는_음식;
	void 배달_음식_주문하다() {
		a좋아하는_음식점.주문(이름, 전화번호, 선호하는_음식의_매운정도, 선호하는_음식);
	}
}

class 김철수 extends 사람 {
	김철수() {
		이름 = "김철수";
		전화번호 = "010-3426-2341";
		a좋아하는_음식점 = new 영화반점();
		선호하는_음식 = "양장피";
		선호하는_음식의_매운정도 = "매콤";
	}
}

class 김영희 extends 사람 {
	김영희() {
		이름 = "김영희";
		전화번호 = "010-1135-0088";
		a좋아하는_음식점 = new 북경반점();
		선호하는_음식 = "탕수육";
		선호하는_음식의_매운정도 = "순한맛";
	}
}

class 선호 {
	void 주문(String 주문자명, String 주문자번호, String 맵기, String 음식) {
	}
}

class 북경반점 extends 선호 {
	void 주문(String 주문자명, String 주문자번호, String 맵기, String 음식) {
		System.out.println("북경반점에서 " + 주문자명 + "(" + 주문자번호 + ")에게 " + 맵기 + " " + 음식 + "을(를) 배달합니다.");
	}
}

class 영화반점 extends 선호 {
	void 주문(String 주문자명, String 주문자번호, String 맵기, String 음식) {
		System.out.println("영화반점에서 " + 주문자명 + "(" + 주문자번호 + ")에게 " + 맵기 + " " + 음식 + "을(를) 배달합니다.");
	}
}