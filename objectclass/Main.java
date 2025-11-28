package objectclass;
//hashcode() example
 class Student3 {
	String name;
	String college;
	int roll;
	String degree;
	String stream;
	
	public Student3()
	{
		
	}

	public Student3(String name, String college, int roll, String degree, String stream) {
		super();
		this.name = name;
		this.college = college;
		this.roll = roll;
		this.degree = degree;
		this.stream = stream;
	}
	public String toString()
	{
		
	return "Name:"+name+",College:"+college+",Roll No:"+roll+",Degree:"+degree+",Stream:"+stream;
		
	} 
	public boolean equals(Object o)
	{
		Student3 s=(Student3)o;
		if(this.name==s.name&& this.college==s.college&& this.roll==s.roll && this.degree==s.degree&& this.stream==s.stream)
		{
			return true;
		}
		return false;
	}
	public int hashcode()
	{
		return roll+name.hashCode()+college.hashCode()+degree.hashCode()+stream.hashCode();
	}

}


public class Main{
	public static void main(String[] args) {
		Student3 s1=new Student3("Sanika","DYP",142,"BTech","CSE");
		System.out.println(s1.hashcode());
		
		Student3 s2=new Student3("Sanu","DYP",142,"BTech","CSE");
		System.out.println(s2.hashcode());
		
		Student3 s3=new Student3("Sanika","DYP",142,"BTech","CSE");
		System.out.println(s3.hashcode());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
}
