package chap01;

public class M0905 {
	public static void main(String[] args) {
		son hm = new son();
		hm.run();
	}
}

class parent {
	public void run() {
		System.out.println("������~ �� �� �� �� �� ��");
	}
}

class son extends parent {
	public void run() {
		super.run();
		System.out.println("�� �Դϴ�");
	}
}