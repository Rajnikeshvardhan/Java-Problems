package interface3;

interface Greeting{
	
	void sayHello();
	
}

public class GreetingGenerator {
	
	
	public static void generateGreeting(){
		
		Greeting greeting = new Greeting(){
			
			@override
			
			public void sayHello() {
				 System.out.println("Hello from the anonymous Inner class");
			
			
		}
		
	};
	
	greeting.sayHello();
		
	}
     public static void main(String[] args) {
    	 generateGreeting();
     }
}
