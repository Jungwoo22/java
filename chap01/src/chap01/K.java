package chap01;

public class K {
	public static void main(String[] args) {
		nnn 실험체 = new nnn();
		실험체.x = 100;
		
		실험체.test();
	}
}

class nnn {
	int x;
	void test() {
		x++;
		System.out.println(x);
		
	}
}