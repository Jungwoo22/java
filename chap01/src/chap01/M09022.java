package chap01;

public class M09022 {
	public static void main(String[] args) {
		Bread p1 = new Bread();
		Bread p2 = new Bread();
		Bread p3 = new Bread();
		Bread p4 = new Bread();
		
		p1.m1();
		p2.m2(50);
		int result1 = p3.m3();
		System.out.println(result1);
		int result2 = p4.m4(2);
		System.out.println(result2);
	}
}
