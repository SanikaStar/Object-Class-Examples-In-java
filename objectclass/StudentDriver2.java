package objectclass;

public class StudentDriver2{
	public static void main(String[] args) {
		Student2 s1=new Student2("Sanika","DYP",142,"BTech","CSE");
		System.out.println(s1);
		
		
		
		Student2 s2=new Student2("Sanika","DYP",142,"BTech","CSE");
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}

}
