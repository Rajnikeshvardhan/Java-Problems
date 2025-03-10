import java.util.*;
class Area_circle{
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float pi=3.14f;
		System.out.println("enter radius of circle");
		int r=sc.nextInt();
		float area=pi*r*r;
		System.out.println("Area of circle is: "+area);
	}
}