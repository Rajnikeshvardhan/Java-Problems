//1. Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
package multithreading;

public class CurrentThreadBuss extends Thread {
	String s;

	public CurrentThreadBuss(String s) {
		this.s = s;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" "+s);
		
		}
	

}}
