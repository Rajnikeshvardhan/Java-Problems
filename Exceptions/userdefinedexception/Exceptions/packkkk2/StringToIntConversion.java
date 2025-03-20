package packkkk2;

import java.util.Scanner;

public class StringToIntConversion {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number:");
			String input = sc.nextLine();
			int number = Integer.parseInt(input);
			System.out.println(number);
		} catch(Exception e) {
			System.out.println(e); 
		} finally {
			System.out.println("Operation Complete");
			sc.close();
			
		}
		
	}

}
