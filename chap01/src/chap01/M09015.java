package chap01;

public class M09015 {
	public static void main(String[] args) {
		��� a = new ���();
		��� b = new ���();
		��� c = new ���();
		
		System.out.println("==�������� ����==");
		a.����("��������", "��");
		a.��ħ("��������", "���", 102.98);
		System.out.println("");
		System.out.println("==����Ǫ�� ����==");
		b.����("����Ǫ��", "����");
		b.��ħ("����Ǫ��", "Ȱȭ��", 398.54);
		System.out.println("");
		System.out.println("==��Ÿ�̰� ����==");
		c.����("��Ÿ�̰�", "���");
		c.��ħ("��Ÿ�̰�", "�丣��", 21.98);
	}
}

class ��� {
	void ����(String ������, String ����) {
		System.out.println(������ + " ��(��) " + ���� + " ��(��) ����Ͽ� ���� �����Ͽ����ϴ�.");
	}
	
	void ��ħ(String ������, String ��, double ������) {
		System.out.println(������ + " ��(��) " + �� + " �� ���� " + ������ + " ��ŭ�� �������� �Ծ����ϴ�.");
	}
}