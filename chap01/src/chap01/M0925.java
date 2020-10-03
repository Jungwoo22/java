package chap01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M0925 {
	
	
	
	public static void main(String[] args) {
		System.out.println("==���α׷� ����==");
		Scanner sc = new Scanner(System.in);

		int lastId = 0;

		List<Article> articles = new ArrayList<>();

		while (true) {
			System.out.print("���ɾ�) ");
			String command = sc.nextLine();
			command = command.trim();

			if (command.contentEquals("system exit")) {
				break;
			} else if (command.contentEquals("article write")) {
				System.out.print("����) ");
				String title = sc.nextLine();
				System.out.print("����) ");
				String body = sc.nextLine();

				int id = lastId + 1;
				lastId = id;
				String regDate = Util.getNowDateStr();

				articles.add(new Article(title, regDate, body, id));
				System.out.printf("(%s) %d��° �� %s�� �����Ǿ����ϴ�.\n", regDate, id, title);
			} else if (command.equals("article list")) {
				if (articles.size() == 0) {
					System.out.println("�ۼ��� ���� �����ϴ�.");
					continue;
				}
				System.out.println("   ��ȣ     |  ��ȸ    |    ����");
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);
					System.out.printf("%5d | %5d | %5s\n", article.id, article.hit, article.title);
				}
			} else if (command.startsWith("article detail ")) {
				String commandBits[] = command.split(" ");
				int id = Integer.parseInt(commandBits[2]);
				int found = id - 1;
				
				Article article = articles.get(found);

				article.increaseHit();
				
				System.out.printf("��ȣ : %d | ��ȸ : %d | ���� : %s | ���� : %s | �ð� : %s\n", article.id, article.hit, article.title, article.body,
						article.regDate);
			} else if (command.startsWith("article modify ")) {
				String commandBits[] = command.split(" ");
				int id = Integer.parseInt(commandBits[2]);
				int found = id - 1;

				Article foundArticle = articles.get(found);

				System.out.print("���� : ");
				String title = sc.nextLine();
				System.out.print("���� : ");
				String body = sc.nextLine();

				foundArticle.title = title;
				foundArticle.body = body;

				System.out.printf("%d�� �Խù��� �����Ǿ����ϴ�.\n", id);
			} else if (command.startsWith("article delete ")) {
				String commandBits[] = command.split(" ");
				int id = Integer.parseInt(commandBits[2]) - 1;

				articles.remove(id);
				System.out.printf("%d��° �Խù��� �����Ǿ����ϴ�.\n", id + 1);
			} else {
				System.out.printf("%s��� ���ɾ�� �������� �ʽ��ϴ�.\n", command);
				continue;
			}
		}

		System.out.println("==���α׷� ��==");
	}
}

class Article {
	String title;
	String regDate;
	String body;
	int id;
	int hit;

	Article(String title, String regDate, String body, int id) {
		this.title = title;
		this.regDate = regDate;
		this.body = body;
		this.id = id;
		this.hit = 0;
	}
	
	public void increaseHit() {
		hit++;
	}
}