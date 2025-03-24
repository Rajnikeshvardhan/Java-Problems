 
//Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.using Anonymous thread class.
package multithreading;



public class GoodMorning2 {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				
				for(int i=0;i<5;i++) {
				System.out.println("GM");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
		
				}
			}
		}.start();
		new Thread() {
			public void run() {
				for(int i=0;i<5;i++) {
				System.out.println("Wellcome");
				
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						
						
						e.printStackTrace();
					}		
				}
			}
		}.start();
		
	}}

