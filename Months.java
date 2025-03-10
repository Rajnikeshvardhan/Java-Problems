class Months{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		
		switch(n){
		case 1,3,5,7,8,10,12:
			System.out.println("This month have 31 days");
			break;
		case 2:
			System.out.println("This month have 28 days");
			break;
		case 4,6,9,11:
			System.out.println("This month have 30 days");
			break;
		default:
			System.out.println("Enter valid month");
			break;
		}
	}
}