package chap01;

public class M0901 {
	public static void main(String[] args) {
		car car1 = new car();
		car1.최고속력 = 200;
		car1.name = "아우디";
		car1.intro();

		car car2 = new car();
		car2.최고속력 = 250;
		car2.name = "벤츠";
		car2.intro();

		car car3 = new car();
		car3.최고속력 = 300;
		car3.name = "QM6";
		car3.intro();
	}
}

class car {
	int 최고속력;
	String name;

	void intro() {
		String 해당이름 = this.name;
		System.out.printf("%s의 최고속력은 %d입니다\n", 해당이름, 최고속력);
	}
}