package chap01;

public class TV {
	String name;
	public void 켜기() {
		System.out.println(name + "가(이) 켜집니다.");
	}
	public void 끄기() {
		System.out.println(name + "가(이) 꺼집니다.");
	}
}

class 삼성 extends TV {
}

class 엘지 extends TV {
}

class 샤오미 extends TV {
}