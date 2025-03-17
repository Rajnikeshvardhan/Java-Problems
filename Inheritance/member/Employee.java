package member;

public class Employee extends Member {
	String specialization;
	public Employee(String specialization,String name,int age,long phoneNumber,String 	address,int salary) {
	super(name,age,phoneNumber,	address,salary);
	this.specialization=specialization;
	
}

}
