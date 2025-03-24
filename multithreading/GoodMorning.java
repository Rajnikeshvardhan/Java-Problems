//1. Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
package multithreading;

public class GoodMorning extends Thread {
	String s;

	public GoodMorning(String s) {
		this.s = s;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(s);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	

}}
