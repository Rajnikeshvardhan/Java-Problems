//Write a program to check if a given string is a palindrome.
class Stringpalindrome{
	public static void main(String[] args) {
		String str=args[0];
		String str2="";
		for(int i=(str.length())-1;i>=0;i--){
			str2=str2+str.charAt(i);
		}
		System.out.println(str2);
		System.out.println(str);
		if(str.equals(str2));
		System.out.println(str+" is a Stringpalindrome");
	    else 
	    	System.out.println(str+" is not Stringpalindrome");
	}
}
