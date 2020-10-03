package chap01;

public class M09152 {
	public static void main(String[] args) {
		try {
			수행1(2);
		} catch (배열길이짧음 e) {
			System.err.println(e.getMessage());
		}
	}

	static void 수행1(int num) throws 배열길이짧음 {
		if (num == 2) {
			throw new 배열길이짧음("짧다능!!");
		}
	}
}

class 배열길이짧음 extends Exception {
	배열길이짧음(String msg) {
		super(msg);
	}
}