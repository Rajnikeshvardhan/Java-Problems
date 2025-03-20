package packkkk2;

public class NestedTry {
      public static void main(String[] args) {
    	  
     try {
    	 try {
    		 int numerator = 10;
    		 int denominator = 0;
    		 int result = numerator/denominator;
    		 System.out.println("Result:" +result);
    	 }catch(ArithmeticException e) {
    		 System.out.println("Caught ArithmeticException: " +e.getMessage());
    	 }
    	 try {
    		 int[] numbers = new int[5];
    		 numbers[10] = 50;
    		 } catch(ArrayIndexOutOfBoundsException e) {
    			 System.out.println("caught ArrayindexOutOfBoundsException:"+e.getMessage());
    		 } 
    	 
     }   catch (Exception e) {
    		 System.out.println("Caught Exception: " + e.getMessage());
    	 
    	        } finally {
    	           System.out.println("Operation complete.");
    	        }
     }
}      
      
