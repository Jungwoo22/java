package chap01;

public class M09064 {
	public static void main(String[] args) {
		순서 순서1 = new 순서();
		순서1.번호 = 1;
		
		순서 순서2 = new 순서();
		순서2.번호 = 2;
		
		순서 순서3 = new 순서();
		순서3.번호 = 3;
		
		순서1.다음사람 = 순서2;
		순서2.다음사람 = 순서3;
		
		순서 처음사람 = 순서1;
		
		System.out.println(처음사람.다음사람.다음사람.번호);
		
	}
}

class 순서 {
	int 번호;
	순서 다음사람;
}