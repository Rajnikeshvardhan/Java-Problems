package member;

public class MemberDriver {
	public static void main(String[] args) {
		Employee e= new Employee("Fresher","Nikesh",23,9876543,"HYD", 50000);
		Manager m=new Manager("Manager","Nikesh",23,9876543,"HYD", 90000);
	e.printSalary();
	m.printSalary();
	}

}
