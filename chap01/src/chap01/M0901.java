package chap01;

public class M0901 {
	public static void main(String[] args) {
		car car1 = new car();
		car1.�ְ�ӷ� = 200;
		car1.name = "�ƿ��";
		car1.intro();

		car car2 = new car();
		car2.�ְ�ӷ� = 250;
		car2.name = "����";
		car2.intro();

		car car3 = new car();
		car3.�ְ�ӷ� = 300;
		car3.name = "QM6";
		car3.intro();
	}
}

class car {
	int �ְ�ӷ�;
	String name;

	void intro() {
		String �ش��̸� = this.name;
		System.out.printf("%s�� �ְ�ӷ��� %d�Դϴ�\n", �ش��̸�, �ְ�ӷ�);
	}
}