package important;

public class M09037 {
	int x = 10;
	static int y = 50;
	
	public static void main(String[] args) {
//		System.out.println(x); 에러
		System.out.println(y);
	}
}

/*
<static>
인스턴스화 하지 않아도 사용할 수 있게 해줌. 객체를 생성하지않아도 사용 가능
static한 메소드안에서 static하지 않은 필드는 사용할 수 없음. 사용하는 시점에 해당 클래스가 인스턴스화되지 않았을 수도 있기 때문에.
해결=>메인 메소드 바깥에서 선언할 때 int x; 가 아니라 static int x; 일케 하기!!
static한 변수만 사용할 수 있음. 사용하고 싶으면 객체 생성!! new이거 사용해서
static변수는 인스턴스가 뭐든 간에 변수명이 같으면 무조건 같은 걸로 생각함 ex) a.test <=> b.test
*/