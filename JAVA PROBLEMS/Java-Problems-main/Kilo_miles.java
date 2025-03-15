import java.util.Scanner;
class Kilo_miles{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter kilometers");
		double km=sc.nextDouble();
		System.out.println(km+" kilometer= "+km*0.621371+" miles");
	}
}