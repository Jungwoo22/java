package chap02;

public class M09083 {
	public static void main(String[] args) {
		���̴��η»繫�� �ȳ� = new ���̴��η»繫��();
		�ȳ�.add("��ī", 71);
		�ȳ�.add("����", 91);
		
		���̴� ���1 = �ȳ�.get(1);
		���̴� ���2 = �ȳ�.get(2);
		
		���1.�ڱ�Ұ�();
		���2.�ڱ�Ұ�();
	}
}

class ���̴��η»繫�� {
	int ��������ȣ;
	���̴� �ϳ�;
	���̴� ��;

	void add(String �̸�, int ź��) {
		���̴� a = new ���̴�();
		a.�̸� = �̸�;
		a.ź�� = ź��;
		a.��ȣ = ��������ȣ + 1;

		if (a.��ȣ == 1) {
			�ϳ� = a;
		} else if (a.��ȣ == 2) {
			�� = a;
		}

		System.out.printf("ź�� %d�� %s�� �߰��Ǿ����ϴ�.\n", ź��, �̸�);
		��������ȣ++;
	}

	���̴� get(int ��ȣ) {
		���̴� b = null;

		if (��ȣ == 1) {
			b = �ϳ�;
		} else if (��ȣ == 2) {
			b = ��;
		}

		return b;
	}
}

class ���̴� extends ���̴��η»繫�� {
	String �̸�;
	int ź��;
	int ��ȣ;

	void �ڱ�Ұ�() {
		System.out.println(��ȣ + ". �ȳ�? ���� " + ź�� + "�� ź���� �ڶ��ϴ� " + �̸� + "(��)��.");
	}
}