package chap01;

public class M09153 {

	public static void main(String[] args) {
		int[] datas = new int[5];

		try {
			ä���_������_3��(datas, 10, 2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ũ�⸦ 3 �̻����� �ø�����");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�");
		} catch (Exception e) {
			System.out.println("�� �� ���� ������ ������� �ʾҽ��ϴ�.");
		}

		for (int i = 0; i < datas.length; i++) {
			System.out.println("datas[" + i + "] : " + datas[i]);
		}
	}

	static void ä���_������_3��(int[] datas, int a, int b) throws ArrayIndexOutOfBoundsException, ArithmeticException {
		for (int i = 0; i < 3; i++) {
			datas[i] = a;
		}

		for (int i = 0; i < datas.length; i++) {
			datas[i] = datas[i] / b;
		}
	}

	static void ä���_3��(int[] datas, int value) {
		for (int i = 0; i < 3; i++) {
			datas[i] = value;
		}
	}

	static void ������_3��(int[] datas, int a) {
		for (int i = 0; i < datas.length; i++) {
			datas[i] = datas[i] / a;
		}
	}
}
