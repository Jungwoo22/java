package important;

import java.util.InputMismatchException;
import java.util.Scanner;

public class M0911 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int age;

		while (true) {
			System.out.print("나이를 입력하세요 : ");

			try {
				age = scan.nextInt();
				scan.nextLine();

				if (age < 1) {
					System.out.println("제대로 된 나이를 입력하세요");
					continue;
				}
			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.println("정수를 입력하세요");
				continue;
			}
			
			break;
		}

		System.out.println(age + "살 입니다");
	}
}
