package chap01;

public class M09073 {
	public static void main(String[] args) {
		int x = 10;
		
		Solution a = new Solution();
		int an = a.solution(x);
		System.out.println(an);
		
		System.out.println();
		
		meme b = new meme();
		b.mmm(x);
	}
}

class Solution {
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}

		return answer;
	}
}

class meme {
	public void mmm(int n) {
		for (int i = 1; i <= n; i++ ) {
			if ( n % i == 0 ) {
				System.out.println(i);
			}
		}
	}
}