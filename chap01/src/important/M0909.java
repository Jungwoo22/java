package important;

public class M0909 {

	public static void main(String[] args) {
		Student a = new Student();
		Student b = new Student();

		a.id = 2017;
		a.nm = "냉냥";
		b.id = 2017;
		b.nm = "냉냥";

		System.out.println(a.toString());
		System.out.println(b.toString());
		
		if (a.equals(b)) {
			System.out.println("일치합니다");
		} else {
			System.out.println("불일치합니다");
		}
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
	}
}

class Student {
	int id;
	String nm;

	@Override
	public String toString() {
		return "Student [id=" + id + ", nm=" + nm + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
}