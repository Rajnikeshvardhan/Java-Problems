package packkkk2;

public class NullPointer {
	public static void main(String[] args) {
		String text = null;
try {
	System.out.println(text.length());
} catch(NullPointerException e) {
	System.out.println("Error: Attempted to call a method on a null object.");
} finally {
	System.out.println("operation complete");
}
}

}
