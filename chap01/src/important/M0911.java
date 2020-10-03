package important;

import java.util.InputMismatchException;
import java.util.Scanner;

public class M0911 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int age;

		while (true) {
			System.out.print("���̸� �Է��ϼ��� : ");

			try {
				age = scan.nextInt();
				scan.nextLine();

				if (age < 1) {
					System.out.println("����� �� ���̸� �Է��ϼ���");
					continue;
				}
			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.println("������ �Է��ϼ���");
				continue;
			}
			
			break;
		}

		System.out.println(age + "�� �Դϴ�");
	}
}
