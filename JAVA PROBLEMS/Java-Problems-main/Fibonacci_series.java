class Fibonacci_series{
	public static void main(String[] args) {
		int input=Integer.parseInt(args[0]);
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;i<=input;i++){
			System.out.print(sum+" ");
			a=b;
			b=sum;
			sum=a+b;

		}

		
	}
}