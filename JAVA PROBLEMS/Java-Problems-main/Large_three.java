import java.util.Scanner;
class Large_three{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Large_three l=new Large_three();
		System.out.println("Enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int res=l.Large(a,b,c);
		System.out.println(res+" is larger");
	}
	int Large(int a,int b,int c){
		if(a>b && a>c)
			return a;
		else if(b>a &&  b>c)
			return b;
		else
			return c;
	}
}