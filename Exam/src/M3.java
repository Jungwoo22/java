import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class M3 {
	public static void main(String[] args) {
		System.out.println("==���α׷� ����==");
		
		Scanner sc = new Scanner(System.in);

		List<Integer> nums = new ArrayList<>();
		
		while (true) {
			System.out.printf("��ɾ�) ");
			String command = sc.nextLine();
			command = command.trim();

			if (command.equals("num")) {
				System.out.printf("���� �Է�) ");
				try {
					int num = sc.nextInt();
					sc.nextLine();
					nums.add(num);
				} catch (InputMismatchException e) {
					System.out.println("�����Դϴ�!!! ������ �Է��ϼ���");
					sc.nextLine();
				}
			} else if (command.contentEquals("nums")) {
				System.out.println(nums.toString());
			} else if (command.contentEquals("system exit")) {
				break;
			} else if (command.length() == 0) {
				continue;
			} else {
				System.out.printf("%s��� ��ɾ�� �������� �ʽ��ϴ�.\n", command);
			}
		}

		sc.close();
		
		System.out.println("==���α׷� ��==");

	}
}
