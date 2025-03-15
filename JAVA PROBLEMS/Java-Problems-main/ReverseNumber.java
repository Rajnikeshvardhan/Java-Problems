class ReverseNumber{
	public static void main(String[] args) {
		int input=Integer.parseInt(args[0]);
		int input1=input;
		int sum=0;
		while(input>0){
			int last=input%10;
			sum=sum*10+last;
			input=input/10;
		}
		System.out.println("Reverse of " + input1 + " is: " + sum);		
	}
}