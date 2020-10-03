package chap01;

public class M0915 {
	public static void main(String[] args) {
		int i1 = 5;
		Integer i2 = new Integer(5);
		Integer i3 = 5;
		
		int i4 = i3.intValue();
		int i5 = i3;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
	}
}
