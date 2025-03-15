
import java.util.Scanner;
class Positive_negative{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		if(n<0)
			System.out.println(n+" is Negative");
		
		else if(n==0)
			System.out.println(n+" is Zero");
		else
			System.out.println(n+" is Positive");
	}
}