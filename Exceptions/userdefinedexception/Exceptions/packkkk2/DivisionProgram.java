package packkkk2;

import java.util.Scanner;

public class DivisionProgram {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
	

		System.out.println("enter the first integer :");
		int numerator = 0;
		int denominator=0;
		
	
	try {
		
		numerator = sc.nextInt();
		
		System.out.print("Enter the second integer: ");
         denominator = sc.nextInt();
		
		int result = numerator/denominator;
		System.out.println("result " +result);
		
	}
	catch (ArithmeticException e) {
		System.out.println("Error: Division by zero is not allowed");
		
	} 
	finally {
		System.out.println("operation complete.");
		sc.close();
	}
  }

}

		 
	
	

		
		
		
	

