package chap02;

public class M09062 {
	public static void main(String[] args) {
		����η»繫�� a�繫�� = new ����η»繫��();
		a�繫��.add���("������", 13);
		��� ���� = a�繫��.get���(1);
		����.�ڱ�Ұ�();
	}
}

class ����η»繫�� {
	int ������_�߰���ȣ;
	��� ù��°;
	��� �ι�°;
	��� ����°;

	void add���(String �̸�, int ����) {
		��� add��� = new ���();
		add���.�̸� = �̸�;
		add���.���� = ����;
		add���.��ȣ = ������_�߰���ȣ + 1;

		System.out.println("���̰� " + add���.���� + "���� " + add���.��ȣ + "��° ��� (" + add���.�̸� + ")�� �߰��Ǿ����ϴ�.");

		if (add���.��ȣ == 1) {
			ù��° = add���;
		} else if (add���.��ȣ == 2) {
			�ι�° = add���;
		} else if (add���.��ȣ == 3) {
			����° = add���;
		}

		������_�߰���ȣ = add���.��ȣ;
	}

	��� get���(int ��ȣ) {
		��� get��� = null;

		if (��ȣ == 1) {
			get��� = ù��°;
		} else if (��ȣ == 2) {
			get��� = �ι�°;
		} else if (��ȣ == 3) {
			get��� = ����°;
		}

		return get���;
	}
}

class ��� {
	String �̸�;
	int ����;
	int ��ȣ;

	void �ڱ�Ұ�() {
		System.out.println("����! ���� " + ��ȣ + "���̰� " + ���� + "�� " + �̸� + "�̾�. �����ߺ� ����");
	}
}