package chap01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M0925 {
	
	
	
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		Scanner sc = new Scanner(System.in);

		int lastId = 0;

		List<Article> articles = new ArrayList<>();

		while (true) {
			System.out.print("명령어) ");
			String command = sc.nextLine();
			command = command.trim();

			if (command.contentEquals("system exit")) {
				break;
			} else if (command.contentEquals("article write")) {
				System.out.print("제목) ");
				String title = sc.nextLine();
				System.out.print("내용) ");
				String body = sc.nextLine();

				int id = lastId + 1;
				lastId = id;
				String regDate = Util.getNowDateStr();

				articles.add(new Article(title, regDate, body, id));
				System.out.printf("(%s) %d번째 글 %s가 생성되었습니다.\n", regDate, id, title);
			} else if (command.equals("article list")) {
				if (articles.size() == 0) {
					System.out.println("작성된 글이 없습니다.");
					continue;
				}
				System.out.println("   번호     |  조회    |    제목");
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
				
				System.out.printf("번호 : %d | 조회 : %d | 제목 : %s | 내용 : %s | 시간 : %s\n", article.id, article.hit, article.title, article.body,
						article.regDate);
			} else if (command.startsWith("article modify ")) {
				String commandBits[] = command.split(" ");
				int id = Integer.parseInt(commandBits[2]);
				int found = id - 1;

				Article foundArticle = articles.get(found);

				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();

				foundArticle.title = title;
				foundArticle.body = body;

				System.out.printf("%d번 게시물이 수정되었습니다.\n", id);
			} else if (command.startsWith("article delete ")) {
				String commandBits[] = command.split(" ");
				int id = Integer.parseInt(commandBits[2]) - 1;

				articles.remove(id);
				System.out.printf("%d번째 게시물이 삭제되었습니다.\n", id + 1);
			} else {
				System.out.printf("%s라는 명령어는 존재하지 않습니다.\n", command);
				continue;
			}
		}

		System.out.println("==프로그램 끝==");
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