class Income_Tax{
	public static void main(String[] args) {
		int income=Integer.parseInt(args[0]);
		System.out.println("Enter your Income");
		if(income<=250000){
			System.out.println("No Tax");
		}
		else if(income<=500000){
			System.out.println("Your Tax 5%:"+(income*0.05));
		}
		
	}
}