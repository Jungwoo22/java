package chap01;

public class M09015 {
	public static void main(String[] args) {
		사냥 a = new 사냥();
		사냥 b = new 사냥();
		사냥 c = new 사냥();
		
		System.out.println("==마리마리 공격==");
		a.공격("마리마리", "총");
		a.다침("마리마리", "흑룡", 102.98);
		System.out.println("");
		System.out.println("==스노푸린 공격==");
		b.공격("스노푸린", "동결");
		b.다침("스노푸린", "활화산", 398.54);
		System.out.println("");
		System.out.println("==잭타이거 공격==");
		c.공격("잭타이거", "용암");
		c.다침("잭타이거", "페르사", 21.98);
	}
}

class 사냥 {
	void 공격(String 공격자, String 무기) {
		System.out.println(공격자 + " 가(이) " + 무기 + " 을(를) 사용하여 적을 공격하였습니다.");
	}
	
	void 다침(String 공격자, String 적, double 데미지) {
		System.out.println(공격자 + " 는(은) " + 적 + " 에 의해 " + 데미지 + " 만큼의 데미지를 입었습니다.");
	}
}