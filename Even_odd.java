import java.util.Scanner;
class Even_odd{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Even_odd e=new Even_odd();
		System.out.println("Enter Number");
		int n=sc.nextInt();
		e.isEvenodd(n);

	}
	void isEvenodd(int n){
		System.out.println(n%2==0?n+" is Even":n+" is odd");
	}
}