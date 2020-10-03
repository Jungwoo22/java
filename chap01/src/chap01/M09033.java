package chap01;

public class M09033 {
	public static void main(String[] args) {
		라면 a = new 신라면();
		라면 b = new 안성탕면();
		
		a.삶기();
		a.먹기();
		b.먹기();
	}
}

interface 라면 {
	void 삶기();
	void 먹기();
}

class 신라면 implements 라면 {
	public void 삶기() {
		System.out.println("신라면 보글복을");
	}
	public void 먹기() {
		System.out.println("신라면을 허겁지겁");
	}
}

class 안성탕면 implements 라면 {
	public void 삶기() {
		System.out.println("안성탕면 보글복을");
	}
	public void 먹기() {
		System.out.println("안성탕면을 허겁지겁");
	}
}