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

	// �迭 ��Ÿ��
	static void exam1() {
		System.out.println("=== ���� 1 ===");
		int articlesSize = 0; // lenght�� �ϸ� �������� ������ �����Ǵϱ�.
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

	// ����Ʈ ��Ÿ��
	// ������ ������ �̸� �������� �ʾƵ� ��
	// [0], [1] ó�� ���� �������� �ʾƵ� ��
	// articlesSize ������ �ʾƵ� �˾Ƽ� ���� �������
	static void exam2() {
		System.out.println("=== ���� 2 ===");
		ArrayList articles = new ArrayList();
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());

		for (int i = 0; i < articles.size(); i++) { // .size()��� �Լ��� ����. ���� �˾Ƽ� ������.
			Article article = (Article) articles.get(i); // ���� ����ȯ�� ����� ��. get()��� �Լ��� ����. �� ��° �ε����� ������ ��.
			System.out.println(article.id);
		}
	}

	// ����Ʈ ��Ÿ�� ����
	// Ÿ���� ���������ν� ����ȯ�� ���� ����
	// �ٸ� Ÿ���� �� ���ٴ� ���� ����
	static void exam3() {
		System.out.println("=== ���� 3 ===");
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

	// ����Ʈ ��Ÿ�� ���Ϻ���
	static void exam4() {
		System.out.println("=== ���� 4 ===");
		List<Article> articles = new ArrayList<>(); // �պκп��� Array�� ����, �޺κп��� Article�� ����
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
	static { // ��Ÿƽ ���� ���� �޼ҵ�
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