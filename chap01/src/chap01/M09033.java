package chap01;

public class M09033 {
	public static void main(String[] args) {
		��� a = new �Ŷ��();
		��� b = new �ȼ�����();
		
		a.���();
		a.�Ա�();
		b.�Ա�();
	}
}

interface ��� {
	void ���();
	void �Ա�();
}

class �Ŷ�� implements ��� {
	public void ���() {
		System.out.println("�Ŷ�� ���ۺ���");
	}
	public void �Ա�() {
		System.out.println("�Ŷ���� �������");
	}
}

class �ȼ����� implements ��� {
	public void ���() {
		System.out.println("�ȼ����� ���ۺ���");
	}
	public void �Ա�() {
		System.out.println("�ȼ������� �������");
	}
}