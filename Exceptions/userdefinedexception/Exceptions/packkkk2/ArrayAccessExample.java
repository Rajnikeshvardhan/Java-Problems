package packkkk2;

public class ArrayAccessExample {
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50};
	

	try{
		int index = 5;
		System.out.println("Accessing elements at index " +index+":" + numbers[index]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Error : index" + e.getMessage() + "is out of Bounds");
	}finally {
		System.out.println("Operation Complete.");
	}
}  	

}
