import java.util.*;
class Volume_sphere{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of sphere");
		int r=sc.nextInt();
		double vol;
		System.out.println("volume is: "+4.0/3.0*3.14*Math.pow(r,3));
	}
}