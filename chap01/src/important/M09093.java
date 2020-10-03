package important;

public class M09093 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hi!?");
		
		System.out.println(sb2);
		System.out.println(sb3);
		
		String str2 = new StringBuffer().append("ÆÙÆÙ").append(" ").append("ÆÙÆÙ").toString();
		
		System.out.println(str2);
		
	}
}
