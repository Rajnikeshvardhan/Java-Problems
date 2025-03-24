package multithreading;

public class DriverThreadc {

	public static void main(String[] args) throws InterruptedException {
		
		
		PrimeFibThread fibThread=new PrimeFibThread(1000);
		
		Thread t1=new Thread() {
			
			public void run() {
				fibThread.primenumber();
			}
		};
		
			Thread t2=new Thread() {
			
			public void run() {
				fibThread.fibonacci_series();
			}
		};
		
		
		
		t1.start();
		t1.join();
		
		
		t2.start();
		
		
		t2.join();

	}

}
