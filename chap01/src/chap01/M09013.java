package chap01;

public class M09013 {
	public static void main(String[] args) {
		û�տ��� aû�տ��� = new û�տ���();
		aû�տ���.����();
		aû�տ���.�����ϴ�();
		
		����� a����� = new �����();
		a�����.����();
		a�����.�����ϴ�();
		
		������ a������ = new ������();
		a������.����();
		a������.�����ϴ�();
		
		��2���� a��2���� = new ��2����();
		a��2����.����();
		a��2����.�����ϴ�();
		
		�κ����� a�κ����� = new �κ�����();
		a�κ�����.����();
		a�κ�����.�����ϴ�();
	}
}

class ���� {
	void ����() {
		System.out.println("������ ������ ���ư��ϴ�.");
	}
	void �����ϴ�() {
		System.out.println("������ �������� �����մϴ�.");
	}
}

class û�տ��� extends ���� {
	
}

class ����� extends ���� {
	
}

class ������ extends ���� {
	void ����() {
		System.out.println("���� �� �� �����. �̤�");
	}
	void �����ϴ�() {
		System.out.println("������ ���� �յ� ���ٴմϴ�.");
	}
}

class ��2���� extends ������ {
	
}

class �κ����� extends ���� {
	
}