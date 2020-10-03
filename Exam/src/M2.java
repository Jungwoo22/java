import java.util.Scanner;

public class M2 {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");

		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0;

		while (true) {
			System.out.printf("명령어) ");
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

				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();

				System.out.printf("%d번째 - 제목 (%s) 내용 (%s)의 글이 생성되었습니다.\n", id, title, body);
			} else if (command.equals("article list")) {
				System.out.println("작성된 글이 없습니다");
			} else {
				System.out.printf("%s라는 명령어는 존재하지 않습니다.\n", command);
			}
		}

		sc.close();

		System.out.println("== 프로그램 끝 ==");
	}
}
