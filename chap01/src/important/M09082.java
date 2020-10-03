package important;

import java.util.ArrayList;
import java.util.List;

public class M09082 {
	public static void main(String[] args) {
//		exam1();	배열 사용
//		exam2();	리스트 사용
//		exam3();	리스트 보완
		exam4(); // 리스트 보완보완
	}

	static void exam1() {
		System.out.println("=1=");
		
		Cidar[] cidar = new Cidar[100];

		int sizeCheck = 0;

		cidar[0] = new Cidar();
		sizeCheck++;
		cidar[1] = new Cidar();
		sizeCheck++;
		cidar[2] = new Cidar();
		sizeCheck++;

		for (int i = 0; i < sizeCheck; i++) {
			System.out.println(cidar[i].id);
		}
	}
	
	static void exam2() {
		System.out.println("=2=");
		
		ArrayList cidar = new ArrayList();
		
		cidar.add(new Cidar());
		cidar.add(new Cidar());
		cidar.add(new Cidar());
		
		for ( int i = 0; i < cidar.size(); i++ ) {
			Cidar cidarr = (Cidar) cidar.get(i);
			System.out.println(cidarr.id);
		}
	}
	
	static void exam3() {
		System.out.println("=3=");
		
		ArrayList<Cidar> cidar = new ArrayList<Cidar>();
		
		cidar.add(new Cidar());
		cidar.add(new Cidar());
		cidar.add(new Cidar());
		
		for ( int i = 0; i < cidar.size(); i++ ) {
			Cidar cidarr = cidar.get(i);
			System.out.println(cidarr.id);
		}
	}
	
	static void exam4() {
		System.out.println("=4=");
		
		List<Cidar> cidar = new ArrayList<>();
		
		cidar.add(new Cidar());
		cidar.add(new Cidar());
		cidar.add(new Cidar());
		
		for ( int i = 0; i < cidar.size(); i++ ) {
			Cidar cidarr = cidar.get(i);
			System.out.println(cidarr.id);
		}
	}
	
}

class Cidar {
	static int lastId;
	int id;
	String name;

	static {
		lastId = 0;
	}

	Cidar() {
		this(lastId + 1, "스프라이트");
		lastId++;
	}

	Cidar(int id, String name) {
		this.id = id;
		this.name = name;
	}

}