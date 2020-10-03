package chap01;

public class M09012 {
	public static void main(String[] args) {
		gugu test = new gugu();
//		test.way1(); 둘 다 같은 값
		test.way2();
	}
}

class gugu {
	void way1() {
		int dan = 2;
		int result;
		while (dan <= 9) {
			int i = 1;
			while (i <= 9) {
				result = dan * i;
				System.out.printf("%d * %d = %d\n", dan, i, result);
				i++;
			}
			dan++;
			System.out.println("");
		}
	}
	
	void way2() {
		for ( int dan = 2; dan <= 9; dan++) {
			for ( int i = 1; i <= 9; i++) {
				int result = dan * i;
				System.out.printf("%d * %d = %d\n", dan, i, result);
			}
			System.out.println("");
		}
	}
}