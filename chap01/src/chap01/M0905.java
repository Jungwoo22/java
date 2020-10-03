package chap01;

public class M0905 {
	public static void main(String[] args) {
		son hm = new son();
		hm.run();
	}
}

class parent {
	public void run() {
		System.out.println("런런런~ 멈 출 수 가 없 어");
	}
}

class son extends parent {
	public void run() {
		super.run();
		System.out.println("쏜 입니다");
	}
}