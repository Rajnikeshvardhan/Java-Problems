package multithreading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("C://Users//admin//OneDrive//Desktop//MultiThreading//123.txt"));
		String s;
		int Wordsc=0;
		int ch=0;
		int l=0;
		
		while((s=br.readLine())!=null) {
			l++;
			
			String arr[]=s.split("\\s++");
			Wordsc=Wordsc+arr.length;
			for(String a:arr) {
				ch=ch+a.length();	
			}
		}
		System.out.println(Wordsc);
		System.out.println(ch);
		System.out.println(l);
	}
}
