class Biggest_Num{
	public static void main(String[] args) {
		long a = Long.parseLong(args[0]);
		 long b = Long.parseLong(args[1]);
		long c = Long.parseLong(args[2]);
		long big= a>b?a:(b>c?b:c);
		System.out.println("biggest: "+big);
	}
}