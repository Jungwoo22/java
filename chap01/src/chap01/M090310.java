package chap01;

public class M090310 {
	public static void main(String[] args) {
		람 a사람 = new 람();
		a사람.달리기_속력 = 120;
		
		a사람.달리다();
	}
}

class 람 {
	int 달리기_속력;
	
	void 달리다() {
		System.out.println("사람이 " + 달리기_속력 + "km/h로 달립니다.");
	}
}