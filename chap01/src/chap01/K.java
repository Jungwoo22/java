package chap01;

public class K {
	public static void main(String[] args) {
		nnn ����ü = new nnn();
		����ü.x = 100;
		
		����ü.test();
	}
}

class nnn {
	int x;
	void test() {
		x++;
		System.out.println(x);
		
	}
}