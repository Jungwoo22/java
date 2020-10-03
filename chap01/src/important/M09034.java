package important;

public class M09034 {
	public static void main(String[] args) {
		메뉴 a = new 한식();
		메뉴 b = new 양식();

		메뉴[] array = new 메뉴[2];
		array[0] = a;
		array[1] = b;
		
		for( int i = 0; i < array.length; i++ ) {
			메뉴 c = array[i];
			c.고르기();
			c.추천하기();
		}
		System.out.println("=====");
		for( 메뉴 j : array ) {
			j.고르기();
			j.추천하기();
		}
	}
}

interface 메뉴 {
	void 고르기();
	void 추천하기();
}

class 한식 implements 메뉴 {
	public void 고르기() {
		System.out.println("한식 먹을까?");
	}
	public void 추천하기() {
		System.out.println("한식 추천ㅋ개추");
	}
}

class 양식 implements 메뉴 {
	public void 고르기() {
		System.out.println("양식 먹을까?");
	}
	public void 추천하기() {
		System.out.println("양식 추천ㅋ개추");
	}
}