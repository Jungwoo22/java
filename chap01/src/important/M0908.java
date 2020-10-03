package important;

import java.util.ArrayList;
import java.util.List;

public class M0908 {
	public static void main(String[] args) {
//		exam1();
//		exam2();
//		exam3();
		exam4();
	}

	// 배열 스타일
	static void exam1() {
		System.out.println("=== 예제 1 ===");
		int articlesSize = 0; // lenght로 하면 쓸데없이 끝까지 구동되니까.
		Article[] articles = new Article[1000];
		articles[0] = new Article();
		articlesSize++;
		articles[1] = new Article();
		articlesSize++;
		articles[2] = new Article();
		articlesSize++;
		articles[3] = new Article();
		articlesSize++;
		articles[4] = new Article();
		articlesSize++;

		for (int i = 0; i < articlesSize; i++) {
			System.out.println(articles[i].id);
		}
	}

	// 리스트 스타일
	// 데이터 갯수를 미리 지정하지 않아도 됨
	// [0], [1] 처럼 직접 선언하지 않아도 됨
	// articlesSize 만들지 않아도 알아서 갯수 기억해줌
	static void exam2() {
		System.out.println("=== 예제 2 ===");
		ArrayList articles = new ArrayList();
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());

		for (int i = 0; i < articles.size(); i++) { // .size()라는 함수가 있음. 갯수 알아서 세어줌.
			Article article = (Article) articles.get(i); // 직접 형변환을 해줘야 함. get()라는 함수가 있음. 몇 번째 인덱스를 가져올 지.
			System.out.println(article.id);
		}
	}

	// 리스트 스타일 보완
	// 타입을 선언함으로써 형변환의 과정 생략
	// 다른 타입은 못 쓴다는 단점 존재
	static void exam3() {
		System.out.println("=== 예제 3 ===");
		ArrayList<Article> articles = new ArrayList<Article>();
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());

		for (int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);
			System.out.println(article.id);
		}
	}

	// 리스트 스타일 보완보완
	static void exam4() {
		System.out.println("=== 예제 4 ===");
		List<Article> articles = new ArrayList<>(); // 앞부분에선 Array를 생략, 뒷부분에선 Article을 생략
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		for (int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);
			System.out.println(article.id);
		}
	}

}

class Article {
	static int lastId;
	int id;
	String regDate;
	static { // 스타틱 변수 관리 메소드
		lastId = 0;
	}

	Article() {
		this(lastId + 1, "2020-12-12 12:12:12");
		lastId++;
	}

	Article(int id, String regDate) {
		this.id = id;
		this.regDate = regDate;
	}
}