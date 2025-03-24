// Write a Word Count program and count words from two or more files files. Write separate threads to count words from a specific file and display word count of each file
package multithreading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileThread {
	String source;

	public FileThread(String source) {
		this.source = source;
	}
	
	public void  read1() throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(source));
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
		System.out.println(Thread.currentThread().getName()+"--> Words:"+Wordsc+" Char:"+ch+" Lines:"+l);
		br.close();
	}
	
	

}
