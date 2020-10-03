package chap01;

public class M09153 {

	public static void main(String[] args) {
		int[] datas = new int[5];

		try {
			채우고_나누기_3개(datas, 10, 2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 3 이상으로 늘리세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch (Exception e) {
			System.out.println("알 수 없는 이유로 수행되지 않았습니다.");
		}

		for (int i = 0; i < datas.length; i++) {
			System.out.println("datas[" + i + "] : " + datas[i]);
		}
	}

	static void 채우고_나누기_3개(int[] datas, int a, int b) throws ArrayIndexOutOfBoundsException, ArithmeticException {
		for (int i = 0; i < 3; i++) {
			datas[i] = a;
		}

		for (int i = 0; i < datas.length; i++) {
			datas[i] = datas[i] / b;
		}
	}

	static void 채우기_3개(int[] datas, int value) {
		for (int i = 0; i < 3; i++) {
			datas[i] = value;
		}
	}

	static void 나누기_3개(int[] datas, int a) {
		for (int i = 0; i < datas.length; i++) {
			datas[i] = datas[i] / a;
		}
	}
}
