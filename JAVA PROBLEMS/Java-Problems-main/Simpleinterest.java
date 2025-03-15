import java.util.*;
class Simpleinterest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Princple,time,rate");
		int p=sc.nextInt();
		int t=sc.nextInt();
		int r=sc.nextInt();
		float si=(p*t*r)/100;
		System.out.println("Simple interest: "+si);
	}
}