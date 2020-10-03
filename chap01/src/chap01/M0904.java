package chap01;

public class M0904 extends M09042 {
	public static void main(String[] args) {
		M0904 test = new M0904();
		System.out.println(test.a); //public
		System.out.println(test.b); //protected
		System.out.println(test.c); //default
//		System.out.println(test.d); //private
		
		test.Exam();
	}
}
