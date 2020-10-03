package chap02;

public class M09063 {
	public static void main(String[] args) {
		인력사무소 a = new 인력사무소();
		a.add사람("이슬이", 30);
		사람 이슬 = a.get사람(1);
		이슬.자기소개();

	}

}

class 인력사무소 {
	int 마지막_번호;
	사람[] 사람들 = new 사람[100];

	void add사람(String 이름, int 나이) {
		사람 애드 = new 사람();
		애드.이름 = 이름;
		애드.나이 = 나이;
		애드.번호 = 마지막_번호 + 1;

		System.out.println(애드.번호 + "번째의 " + 애드.나이 + "살 " + 애드.이름 + "가 추가되었습니다.");

		사람들[애드.번호 - 1] = 애드;
		마지막_번호 = 애드.번호;
	}

	사람 get사람(int 번호) {
		return 사람들[번호 - 1];
	}
}

class 사람 {
	String 이름;
	int 나이;
	int 번호;
	
	void 자기소개() {
		System.out.printf("나이가 %d인 %d번째 %s라고 합니다. 만 반 잘 부 ㅋ", 나이, 번호, 이름);
	}
}