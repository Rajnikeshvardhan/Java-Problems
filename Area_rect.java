import java.util.*;
class Area_rect{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length");
		int len=sc.nextInt();
		System.out.println("Enter breadth");
		int br=sc.nextInt();
		int area=len*br;
		System.out.println("area of rectangle is: "+area);
	}
}