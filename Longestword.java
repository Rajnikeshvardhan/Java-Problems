package iostreams;
import java.io.*;
public class Longestword  {
public static void main(String[] args)throws IOException {
		
	
	BufferedReader  fr = new BufferedReader(new FileReader("C://Users//DAC-User34//Desktop//IOstrems//Longestword.txt"));
	int x;
	int c=0,max=0;
	String s,s2="";
	
	while((s=fr.readLine())!= null) {
		
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length() > max) {
				max = arr[i].length();//5
					s2=arr[i];//you//should
			}
		}
		
	
}
				System.out.println(s2);
	}
}
