import java.util.*;
class Hypotenuse{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two sides of triangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		c=(int)Math.sqrt(a*a+b*b);
		System.out.println("third side of triangle is: "+c);
	}
}