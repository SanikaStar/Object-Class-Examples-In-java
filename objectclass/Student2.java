package objectclass;
//equals()  example
public class Student2 {
	String name;
	String college;
	int roll;
	String degree;
	String stream;
	
	public Student2()
	{
		
	}

	public Student2(String name, String college, int roll, String degree, String stream) {
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
		Student2 s=(Student2)o;
		if(this.name==s.name&& this.college==s.college&& this.roll==s.roll && this.degree==s.degree&& this.stream==s.stream)
		{
			return true;
		}
		return false;
	}

}
