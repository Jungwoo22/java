package important;

//import chap01.사람;

public class M09038 {
	public static void main(String[] args) {
		사람 a김철수 = new 사람();
		a김철수.이름 = "김철수";
		a김철수.전화번호 = "010-7878-5656";
		a김철수.a좋아하는_음식점 = new 영화반점();
		a김철수.선호하는_음식의_매운정도 = "핵맵";
		a김철수.선호하는_음식 = "짬뽕";
		
		a김철수.배달_음식_주문하다();
		
		사람 a김영희 = new 사람();
		a김영희.이름 = "김영희";
		a김영희.전화번호 = "010-1239-9525";
		a김영희.a좋아하는_음식점 = new 북경반점();
		a김영희.선호하는_음식의_매운정도 = "맵찔이 전용";
		a김영희.선호하는_음식 = "짜장";
		
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

/*
주문으로 변수 넘기는 다른 방법
void 배달_음식_주문하다() {
		a좋아하는_음식점.이름 = this.이름;
		a좋아하는_음식점.전화번호 = this.전화번호;
		a좋아하는_음식점.맵기 = this.선호하는_음식의_매운정도;
		a좋아하는_음식점.음식 = this.선호하는_음식;
		a좋아하는_음식점.주문();
	}
}

class 선호 {
	String 이름;
	String 전화번호;
	String 맵기;
	String 음식;
	void 주문() {
		
	}
*/