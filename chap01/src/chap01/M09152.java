package chap01;

public class M09152 {
	public static void main(String[] args) {
		try {
			����1(2);
		} catch (�迭����ª�� e) {
			System.err.println(e.getMessage());
		}
	}

	static void ����1(int num) throws �迭����ª�� {
		if (num == 2) {
			throw new �迭����ª��("ª�ٴ�!!");
		}
	}
}

class �迭����ª�� extends Exception {
	�迭����ª��(String msg) {
		super(msg);
	}
}