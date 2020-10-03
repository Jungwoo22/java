package chap01;

import java.util.Random;

public class M09094 {
	public static void main(String[] args) {
		int random = new Random().nextInt(5);
		System.out.println(random);
		
		long time = System.currentTimeMillis();
		System.out.println(time);
	}
}
