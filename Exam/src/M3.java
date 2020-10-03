import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class M3 {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		
		Scanner sc = new Scanner(System.in);

		List<Integer> nums = new ArrayList<>();
		
		while (true) {
			System.out.printf("명령어) ");
			String command = sc.nextLine();
			command = command.trim();

			if (command.equals("num")) {
				System.out.printf("숫자 입력) ");
				try {
					int num = sc.nextInt();
					sc.nextLine();
					nums.add(num);
				} catch (InputMismatchException e) {
					System.out.println("에러입니다!!! 정수를 입력하세요");
					sc.nextLine();
				}
			} else if (command.contentEquals("nums")) {
				System.out.println(nums.toString());
			} else if (command.contentEquals("system exit")) {
				break;
			} else if (command.length() == 0) {
				continue;
			} else {
				System.out.printf("%s라는 명령어는 존재하지 않습니다.\n", command);
			}
		}

		sc.close();
		
		System.out.println("==프로그램 끝==");

	}
}
