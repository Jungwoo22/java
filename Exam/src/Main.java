import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		System.out.print("��ɾ�) ");
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine();
		System.out.printf("�Էµ� ��ɾ� : %s\n", command);
		sc.close();
		
		System.out.println("���α׷� ��");
	}
}
