package userdefinedexception;

public class NegativeBalanceException extends Exception {

	public NegativeBalanceException(String strin) {
		super(strin);
	}

}
