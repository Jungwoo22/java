package chap01;

public class M09112 {
	public static void main(String[] args) {
		try {
			����(2);
		} catch (�迭ª��_Exception e) {
			System.err.println(e.getMessage());
		}
	}

	static void ����(int num) throws �迭ª��_Exception {
		if (num == 2) {
			throw new �迭ª��_Exception("����");
		}
	}
}

class �迭ª��_Exception extends Exception {
	�迭ª��_Exception(String msg) {
		super(msg);
	}
}