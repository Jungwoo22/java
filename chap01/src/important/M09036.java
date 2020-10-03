package important;

public class M09036 {
	public static void main(String[] args) {
		전사 a전사 = new 전사();
		
		a전사.이름 = "칸";
		a전사.나이 = 20;
		a전사.자기소개();
		
		a전사.나이++;
		a전사.자기소개();
		
		a전사.이름 = "카니";
		a전사.나이 = 30;
		a전사.자기소개();
		
		a전사.현재사용무기 = new 활();
		a전사.공격();
	}
}

class 전사 {
	String 이름;
	int 나이;
	무기 현재사용무기;
	
	void 자기소개() {
		System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + "입니다.");
	}
	void 공격() {
		현재사용무기.사용자명 = this.이름;
		현재사용무기.작동();
	}
}

class 무기 {
	String 사용자명;
	void 작동() {
		
	}
}

class 칼 extends 무기 {
	void 작동() {
		System.out.println(사용자명 + " 이(가) 칼로 공격합니다.");
	}
}

class 활 extends 무기 {
	void 작동() {
		System.out.println(사용자명 + " 이(가) 활로 공격합니다.");
	}
}