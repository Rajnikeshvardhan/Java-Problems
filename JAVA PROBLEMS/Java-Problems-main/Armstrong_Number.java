//Write a program to check if a given number is Armstrong.
class Armstrong_Number{
	public static void main(String[] args) {
		int input=Integer.parseInt(args[0]);
		int input1=input;
		int sum=0;
		while(input>0){
			int last=input%10;
			sum=sum+last*last*last;
			input=input/10;
		}
		if(input1==sum)
		System.out.println(input1 + " is Armstrong Number ");
	    else
	    	System.out.println(input1 + " is not a Armstrong Number ");

		

		
	}
}