package important;

public class M09034 {
	public static void main(String[] args) {
		�޴� a = new �ѽ�();
		�޴� b = new ���();

		�޴�[] array = new �޴�[2];
		array[0] = a;
		array[1] = b;
		
		for( int i = 0; i < array.length; i++ ) {
			�޴� c = array[i];
			c.����();
			c.��õ�ϱ�();
		}
		System.out.println("=====");
		for( �޴� j : array ) {
			j.����();
			j.��õ�ϱ�();
		}
	}
}

interface �޴� {
	void ����();
	void ��õ�ϱ�();
}

class �ѽ� implements �޴� {
	public void ����() {
		System.out.println("�ѽ� ������?");
	}
	public void ��õ�ϱ�() {
		System.out.println("�ѽ� ��õ������");
	}
}

class ��� implements �޴� {
	public void ����() {
		System.out.println("��� ������?");
	}
	public void ��õ�ϱ�() {
		System.out.println("��� ��õ������");
	}
}