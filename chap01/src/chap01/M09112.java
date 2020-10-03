package chap01;

public class M09112 {
	public static void main(String[] args) {
		try {
			수행(2);
		} catch (배열짧음_Exception e) {
			System.err.println(e.getMessage());
		}
	}

	static void 수행(int num) throws 배열짧음_Exception {
		if (num == 2) {
			throw new 배열짧음_Exception("에러");
		}
	}
}

class 배열짧음_Exception extends Exception {
	배열짧음_Exception(String msg) {
		super(msg);
	}
}