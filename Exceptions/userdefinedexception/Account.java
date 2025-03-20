package userdefinedexception;

public class Account {
private String acctype;
private	int accnum;
private	int minblc;
private	int p;
private int t;
private	double r;
	
	public Account(String acctype, int accnum, int minblc, int p, int t, double r) {
		this.acctype = acctype;
		this.accnum = accnum;
		this.minblc = minblc;
		this.p = p;
		this.t = t;
		this.r = r;
		
	}
	


	public void calculateinterest() throws NegativeBalanceException 
	{
		if (minblc<0)
		{
			throw new NegativeBalanceException("cannot calculate"); 
		}
		else {
		double interest=(p*t*r)/100;
		System.out.println(interest);
	}}
  public void display() {
	  System.out.println("minblc" +minblc);
  }
}
