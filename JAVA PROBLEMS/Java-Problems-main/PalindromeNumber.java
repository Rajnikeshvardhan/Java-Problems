class PalindromeNumber{
	public static void main(String[] args) {
		int input=Integer.parseInt(args[0]);
		int sum=0;
		int input1=input;//preserving actual input as input1 
		while(input>0){
			int last=input%10;
			sum=sum*10+last;
			input=input/10;
		}
		System.out.println(sum);
		if(input1==sum){
		System.out.println("Its a Palindrome Number");	
		}
	    else
		System.out.println("Its not a Palindrome Number");		
	}
}