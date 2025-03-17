package member;

public class Manager extends Member {
	String department;
	public Manager(String department,String name, int age, long phoneNumber, String address, int salary) {
		super(name, age, phoneNumber, address, salary);
		this.department=department;
	}

	
	

}
