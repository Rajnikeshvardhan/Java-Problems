import java.util.Scanner;
class Calculator{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Valid Number to which Operation can be Performed");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n.4.Division");
		int n=sc.nextInt();
		System.out.println("Enter  a and b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(n){
		case 1:
			System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
			break;
		case 2:
			System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
			break;
		case 4:
			System.out.println("Division of "+a+" and "+b+" is "+(double)(a/b));
			break;
		default:
			System.out.println("please enter b/w 1-4");
			break;

		}
	}
}