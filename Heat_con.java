import java.util.*;
class Heat_con{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temperature in celcious");
		float c=sc.nextFloat();
		float f=(c*9/5)+32;
		System.out.println("Fahrenheit temperature is "+f);
	}
}