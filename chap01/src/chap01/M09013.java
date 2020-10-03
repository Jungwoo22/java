package chap01;

public class M09013 {
	public static void main(String[] args) {
		청둥오리 a청둥오리 = new 청둥오리();
		a청둥오리.날다();
		a청둥오리.수영하다();
		
		흰오리 a흰오리 = new 흰오리();
		a흰오리.날다();
		a흰오리.수영하다();
		
		고무오리 a고무오리 = new 고무오리();
		a고무오리.날다();
		a고무오리.수영하다();
		
		고무2오리 a고무2오리 = new 고무2오리();
		a고무2오리.날다();
		a고무2오리.수영하다();
		
		로봇오리 a로봇오리 = new 로봇오리();
		a로봇오리.날다();
		a로봇오리.수영하다();
	}
}

class 오리 {
	void 날다() {
		System.out.println("오리가 날개로 날아갑니다.");
	}
	void 수영하다() {
		System.out.println("오리가 물갈퀴로 수영합니다.");
	}
}

class 청둥오리 extends 오리 {
	
}

class 흰오리 extends 오리 {
	
}

class 고무오리 extends 오리 {
	void 날다() {
		System.out.println("저는 날 수 없어요. ㅜㅠ");
	}
	void 수영하다() {
		System.out.println("오리가 물에 둥둥 떠다닙니다.");
	}
}

class 고무2오리 extends 고무오리 {
	
}

class 로봇오리 extends 오리 {
	
}