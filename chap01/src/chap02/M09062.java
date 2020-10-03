package chap02;

public class M09062 {
	public static void main(String[] args) {
		상람인력사무소 a사무소 = new 상람인력사무소();
		a사무소.add상람("퉁퉁이", 13);
		상람 퉁퉁 = a사무소.get상람(1);
		퉁퉁.자기소개();
	}
}

class 상람인력사무소 {
	int 마지막_추가번호;
	상람 첫번째;
	상람 두번째;
	상람 세번째;

	void add상람(String 이름, int 나이) {
		상람 add상람 = new 상람();
		add상람.이름 = 이름;
		add상람.나이 = 나이;
		add상람.번호 = 마지막_추가번호 + 1;

		System.out.println("나이가 " + add상람.나이 + "살인 " + add상람.번호 + "번째 상람 (" + add상람.이름 + ")이 추가되었습니다.");

		if (add상람.번호 == 1) {
			첫번째 = add상람;
		} else if (add상람.번호 == 2) {
			두번째 = add상람;
		} else if (add상람.번호 == 3) {
			세번째 = add상람;
		}

		마지막_추가번호 = add상람.번호;
	}

	상람 get상람(int 번호) {
		상람 get상람 = null;

		if (번호 == 1) {
			get상람 = 첫번째;
		} else if (번호 == 2) {
			get상람 = 두번째;
		} else if (번호 == 3) {
			get상람 = 세번째;
		}

		return get상람;
	}
}

class 상람 {
	String 이름;
	int 나이;
	int 번호;

	void 자기소개() {
		System.out.println("하이! 나는 " + 번호 + "번이고 " + 나이 + "살 " + 이름 + "이야. 만반잘부 ㅋㅋ");
	}
}