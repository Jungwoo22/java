package important;

public class M09037 {
	int x = 10;
	static int y = 50;
	
	public static void main(String[] args) {
//		System.out.println(x); ����
		System.out.println(y);
	}
}

/*
<static>
�ν��Ͻ�ȭ ���� �ʾƵ� ����� �� �ְ� ����. ��ü�� ���������ʾƵ� ��� ����
static�� �޼ҵ�ȿ��� static���� ���� �ʵ�� ����� �� ����. ����ϴ� ������ �ش� Ŭ������ �ν��Ͻ�ȭ���� �ʾ��� ���� �ֱ� ������.
�ذ�=>���� �޼ҵ� �ٱ����� ������ �� int x; �� �ƴ϶� static int x; ���� �ϱ�!!
static�� ������ ����� �� ����. ����ϰ� ������ ��ü ����!! new�̰� ����ؼ�
static������ �ν��Ͻ��� ���� ���� �������� ������ ������ ���� �ɷ� ������ ex) a.test <=> b.test
*/