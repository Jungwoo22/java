import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M4 {
	public static void main(String[] args) {
		System.out.println("== ���α׷� ���� ==");

		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0;

		List<Article> articles = new ArrayList<>();

		while (true) {
			System.out.printf("��ɾ�) ");
			String command = sc.nextLine();
			command = command.trim();

			if (command.length() == 0) {
				continue;
			}

			if (command.equals("system exit")) {
				break;
			} else if (command.equals("article write")) {
				int id = lastArticleId + 1;
				lastArticleId = id;

				System.out.printf("���� : ");
				String title = sc.nextLine();
				System.out.printf("���� : ");
				String body = sc.nextLine();

				Article article = new Article(id, title, body);
				articles.add(article);

			} else if (command.equals("article list")) {
				if (articles.size() == 0) {
					System.out.println("�ۼ��� ���� �����ϴ�");
					continue;
				} else {
					System.out.println("��ȣ | ����");
					for (int i = articles.size() - 1; i >= 0; i--) {
						Article article = articles.get(i);
						System.out.printf("%d  | %s\n", article.id, article.title);
					}
				}
			} else {
				System.out.printf("%s��� ��ɾ�� �������� �ʽ��ϴ�.\n", command);
			}
		}

		sc.close();

		System.out.println("== ���α׷� �� ==");
	}
}

class Article {
	int id;
	String title;
	String body;

	public Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}
}
