package objectclass;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1=new Employee("Sanika","Infosys",123,"Developer",50000.0);
		System.out.println(e1);
		
		Employee e2=new Employee("Sanika","Infosys",1234,"Developer",50000.0);
		System.out.println(e2);
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		
		
	}

}

