import java.util.*;
class Compound_interest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Princple,time,rate");
		int p=sc.nextInt();
		int t=sc.nextInt();
		float r=sc.nextFloat();
		int n=sc.nextInt();
		float z=(float)Math.pow((1+r/n),n*t);
		float ci=p*z;
		System.out.println("Simple interest: "+ci);
	}
}