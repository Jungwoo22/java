package chap01;

public class M09035 {
	public static void main(String[] args) {
		int i = �κ�.get����();
		boolean b = �κ�.get��();
		�ΰ� a�ΰ� = �κ�.get�ΰ�();
		�ΰ� a�ΰ�2 = �κ�.get�ΰ�2();
		�ΰ� a�ΰ�3 = �κ�.get�ΰ�3();
		�ΰ� a�ΰ�4 = �κ�.get�ΰ�4();
		�ΰ� a�ΰ�5 = �κ�.get�ΰ�5(123, false);
		�κ�.get�ΰ�6(123, false);
	}
}

class �κ� {
	static int get����() {
		return 0;
	}

	static boolean get��() {
		return true;
	}

	static �ΰ� get�ΰ�() {
		return null;
		
	}

	static �ΰ� get�ΰ�2() {
		return new �ΰ�();
	}

	static �ΰ� get�ΰ�3() {
		�ΰ� a�ΰ�;
		a�ΰ� = null;
		return a�ΰ�;
	}

	static �ΰ� get�ΰ�4() {
		�ΰ� a�ΰ� = new �ΰ�();
		return a�ΰ�;
	}

	static �ΰ� get�ΰ�5(int ����, boolean ��ȥ����) {
		�ΰ� a�ΰ� = new �ΰ�();
		a�ΰ�.���� = ����;
		a�ΰ�.��ȥ���� = ��ȥ����;
		return a�ΰ�;
	}
	static void get�ΰ�6(int ����, boolean ��ȥ����) {
		�ΰ� a�ΰ� = new �ΰ�();
		a�ΰ�.���� = ����;
		a�ΰ�.��ȥ���� = ��ȥ����;
	}
}

class �ΰ� {
	int ����;
	boolean ��ȥ����;
}