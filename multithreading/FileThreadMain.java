package multithreading;

import java.io.IOException;

public class FileThreadMain {
	public static void main(String[] args) {
		Thread t1 =new Thread() {
		FileThread f1 =new FileThread("C://Users//admin//OneDrive//Desktop//MultiThreading//123.txt");
		public void run() {
			try {
				f1.read1();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		};
		t1.setName("123.txt");
		t1.start();
		
		Thread t2 = new Thread() {
			FileThread f1 =new FileThread("C://Users//admin//OneDrive//Desktop//MultiThreading//Copy.txt");
			public void run() {
				try {
					f1.read1();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			};
			t2.setName("Cpoy.txt");
			t2.start();		
		
	}
}
