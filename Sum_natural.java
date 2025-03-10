import java.util.*;
class Sum_natural{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		double sum=(n*(n+1))/2;
		System.out.println("sum of "+n+" terms is "+sum);
	}
}