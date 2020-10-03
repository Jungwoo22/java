package chap02;

public class M09083 {
	public static void main(String[] args) {
		사이다인력사무소 냠냠 = new 사이다인력사무소();
		냠냠.add("코카", 71);
		냠냠.add("맥콜", 91);
		
		사이다 결과1 = 냠냠.get(1);
		사이다 결과2 = 냠냠.get(2);
		
		결과1.자기소개();
		결과2.자기소개();
	}
}

class 사이다인력사무소 {
	int 마지막번호;
	사이다 하나;
	사이다 둘;

	void add(String 이름, int 탄산) {
		사이다 a = new 사이다();
		a.이름 = 이름;
		a.탄산 = 탄산;
		a.번호 = 마지막번호 + 1;

		if (a.번호 == 1) {
			하나 = a;
		} else if (a.번호 == 2) {
			둘 = a;
		}

		System.out.printf("탄산 %d의 %s가 추가되었습니다.\n", 탄산, 이름);
		마지막번호++;
	}

	사이다 get(int 번호) {
		사이다 b = null;

		if (번호 == 1) {
			b = 하나;
		} else if (번호 == 2) {
			b = 둘;
		}

		return b;
	}
}

class 사이다 extends 사이다인력사무소 {
	String 이름;
	int 탄산;
	int 번호;

	void 자기소개() {
		System.out.println(번호 + ". 안녕? 나는 " + 탄산 + "의 탄산을 자랑하는 " + 이름 + "(이)야.");
	}
}