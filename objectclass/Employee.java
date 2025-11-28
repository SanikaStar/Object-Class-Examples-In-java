package objectclass;

public class Employee {
	
	String name;
	String company;
	int empId;
	String domain;
	double salary;
																																																																									
	public Employee()
	{
		
	}

	public Employee(String name, String company, int empId, String domain, double salary) {
		super();
		this.name = name;
		this.company = company;
		this.empId = empId;
		this.domain = domain;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Name:"+name+", Company:"+company+", EMP_ID:"+empId+", Domain:"+domain+", Salary:"+salary;
	}
	
	public boolean  equals(Object o)
	{
		return this.empId==((Employee)o).empId;
	}
	

}
