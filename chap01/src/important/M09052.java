package important;

public class M09052 {
	public static void main(String[] args) {
		������ a = new ������();
		System.out.println(a.����);
//		a.���� = 7000; ����. ����� �� �ٲ�
		
		��Ʈ b = new ��Ʈ();
		System.out.println(b.��);
		b.�� = 20000;
		System.out.println(b.��);
	}
}

interface ����� {
	int ���� = 5000;
}

class ������ implements ����� {
	
}

class ���� {
	int �� = 10000;
}

class ��Ʈ extends ���� {
	
}