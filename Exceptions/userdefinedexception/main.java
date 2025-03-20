package userdefinedexception;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a = new Account("savings",8977,-4,100,3,2);
		Customerclass c=new Customerclass("jndjschb", "ksdkjd", 34,3445, a);
		c.display();
		try {
			a.calculateinterest();
		}
		catch(NegativeBalanceException e){
			System.out.println(e);
		}
		
	}	

}
