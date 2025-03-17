package Constr;

public class Employee extends Person{
	String comName;
	
	public Employee(String comName, String name, String adr) {
		super(name,adr);
		this.comName=comName;
		System.out.println("child class constr");
	}
}
