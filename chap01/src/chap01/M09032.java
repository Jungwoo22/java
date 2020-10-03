package chap01;

public class M09032 {
	페라리 a페라리 = new 페라리();
	자동차 a자동차 = a페라리;
	
//	페라리 a페라리2 = a자동차; 에러
	페라리 a페라리2 = (페라리)a자동차;
}

class 자동차 {
	void 달리다() {}
	void 서다() {}
}

class 페라리 extends 자동차 {
	void 뚜껑이_열리다() {}
}