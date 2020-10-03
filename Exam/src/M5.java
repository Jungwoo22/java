import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String command;
		int lastId = 0;
		text foundText = null;
		List<text> texts = new ArrayList<>();

		while (true) {
			System.out.print("명령어) ");
			command = sc.nextLine();
			command = command.trim();

			if (command.contentEquals("system exit")) {
				break;
			} else if (command.equals("article write")) {
				System.out.print("제목) ");
				String title = sc.nextLine();

				System.out.print("내용) ");
				String body = sc.nextLine();

				int Id = lastId + 1;
				lastId = Id;

				texts.add(new text(title, body, Id));
				System.out.printf("%d번 글이 생성되었습니다.\n", Id);
			} else if (command.equals("article list")) {
				if (texts.size() == 0) {
					System.out.println("비어있습니다.");
				} else {
					for (int i = texts.size() - 1; i >= 0; i--) {
						text a = texts.get(i);
						System.out.printf("번호 | 제목\n");
						System.out.printf(" %d | %s\n", a.Id, a.title);
					}
				}
			} else if (command.startsWith("article detail ")) {
				String[] commandBits = command.split(" ");
				int a = Integer.parseInt(commandBits[2]);

				for (int i = 0; i < texts.size(); i++) {
					text text = texts.get(i);

					if (text.Id == a) {
						foundText = text;
						continue;
					}
				}

				if (foundText == null) {
					System.out.printf("%d번 게시물은 존재하지 않습니다.\n", a);
					continue;
				}

				System.out.printf("번호 : %d\n", foundText.Id);
				System.out.printf("날짜 : 2020-09-23-20-09\n");
				System.out.printf("제목 : %s\n", foundText.title);
				System.out.printf("내용 : %s\n", foundText.body);
			}

			else if (command.startsWith("article delete ")) {
				String[] commandBits = command.split(" ");
				int id = Integer.parseInt(commandBits[2]);

				int foundIndex = -1;

				for (int i = 0; i < texts.size(); i++) {
					text text = texts.get(i);

					if (text.Id == id) {
						foundIndex = i;
						break;
					}
				}

				if (foundIndex == -1) {
					System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id);
					continue;
				}

				texts.remove(foundIndex);
				System.out.printf("%d번 게시물이 삭제되었습니다.\n", id);

			}

			else {
				System.out.printf("%s라는 명령어는 존재하지 않습니다.\n", command);
			}

		}
	}
}

class text {
	String title;
	String body;
	int Id;

	text(String title, String body, int Id) {
		this.title = title;
		this.body = body;
		this.Id = Id;
	}
}
