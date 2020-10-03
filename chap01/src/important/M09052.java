package important;

public class M09052 {
	public static void main(String[] args) {
		생강차 a = new 생강차();
		System.out.println(a.가격);
//		a.가격 = 7000; 에러. 상수라 못 바꿈
		
		민트 b = new 민트();
		System.out.println(b.얼마);
		b.얼마 = 20000;
		System.out.println(b.얼마);
	}
}

interface 음료수 {
	int 가격 = 5000;
}

class 생강차 implements 음료수 {
	
}

class 음료 {
	int 얼마 = 10000;
}

class 민트 extends 음료 {
	
}