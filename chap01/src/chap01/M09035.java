package chap01;

public class M09035 {
	public static void main(String[] args) {
		int i = 로봇.get정수();
		boolean b = 로봇.get논리();
		인간 a인간 = 로봇.get인간();
		인간 a인간2 = 로봇.get인간2();
		인간 a인간3 = 로봇.get인간3();
		인간 a인간4 = 로봇.get인간4();
		인간 a인간5 = 로봇.get인간5(123, false);
		로봇.get인간6(123, false);
	}
}

class 로봇 {
	static int get정수() {
		return 0;
	}

	static boolean get논리() {
		return true;
	}

	static 인간 get인간() {
		return null;
		
	}

	static 인간 get인간2() {
		return new 인간();
	}

	static 인간 get인간3() {
		인간 a인간;
		a인간 = null;
		return a인간;
	}

	static 인간 get인간4() {
		인간 a인간 = new 인간();
		return a인간;
	}

	static 인간 get인간5(int 나이, boolean 기혼여부) {
		인간 a인간 = new 인간();
		a인간.나이 = 나이;
		a인간.기혼여부 = 기혼여부;
		return a인간;
	}
	static void get인간6(int 나이, boolean 기혼여부) {
		인간 a인간 = new 인간();
		a인간.나이 = 나이;
		a인간.기혼여부 = 기혼여부;
	}
}

class 인간 {
	int 나이;
	boolean 기혼여부;
}