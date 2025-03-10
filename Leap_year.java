import java.util.Scanner;
class Leap_year{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int year=sc.nextInt();
		boolean t=is_leapyear( year);
		if(t)
			System.out.println(year+" is leapyear");
		else
			System.out.println(year+" is not a leapyear");
	}
	static boolean is_leapyear(int y){
		if(y%400==0 && y%100==0)
			return true;
		else if(y%4==0 && y%100!=0)
			return true;
		else 
			return false;
	}
}