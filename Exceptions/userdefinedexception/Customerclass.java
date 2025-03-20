package userdefinedexception;

public class Customerclass {
private	String name;
	private String address;
	private int id;
	private long phoneno;
	private Account acc;
	
 public Customerclass(String name, String address, int id, long phoneno, Account acc) {
		
		this.name = name;
		this.address = address;
		this.id = id;
		this.phoneno = phoneno;
		this.acc = acc;
	}

public void display(){
	 System.out.println(name+" "+address+" "+id+" "+phoneno);
	 acc.display();
	 
 }
}
