package important;

public class M09036 {
	public static void main(String[] args) {
		���� a���� = new ����();
		
		a����.�̸� = "ĭ";
		a����.���� = 20;
		a����.�ڱ�Ұ�();
		
		a����.����++;
		a����.�ڱ�Ұ�();
		
		a����.�̸� = "ī��";
		a����.���� = 30;
		a����.�ڱ�Ұ�();
		
		a����.�����빫�� = new Ȱ();
		a����.����();
	}
}

class ���� {
	String �̸�;
	int ����;
	���� �����빫��;
	
	void �ڱ�Ұ�() {
		System.out.println("�ȳ��ϼ���. ���� " + this.���� + "�� " + this.�̸� + "�Դϴ�.");
	}
	void ����() {
		�����빫��.����ڸ� = this.�̸�;
		�����빫��.�۵�();
	}
}

class ���� {
	String ����ڸ�;
	void �۵�() {
		
	}
}

class Į extends ���� {
	void �۵�() {
		System.out.println(����ڸ� + " ��(��) Į�� �����մϴ�.");
	}
}

class Ȱ extends ���� {
	void �۵�() {
		System.out.println(����ڸ� + " ��(��) Ȱ�� �����մϴ�.");
	}
}