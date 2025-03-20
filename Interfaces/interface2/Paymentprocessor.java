package interface2;

public class Paymentprocessor {
	public static void main(String[] args) {
		Payment p = new Creditcardpayment();
		Payment pp = new Paypalpayment();
		p.pay();
		pp.pay();
		
		
	}

}
