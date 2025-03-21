//1. Write a Program to read the same program file and find the no. of lines, words and characters. Write the result in in to a text file (result.txt

package iostreams;
import java.io.*;
public class Numofines {

	public static void main(String[] args) throws IOException {
//		File file = new File("C://Users//DAC-User34//Desktop//IOstrems//Numoflines");
//		FileWriter fw = new FileWriter(file);
//		fw.write("Java is a robust language \nJava is an OOP language \nJava is secure \nJava is simple \nJava is distributed" );
		FileReader fr=new FileReader("C://Users//DAC-User34//Desktop//IOstrems//Numoflines");
		int x;
		int Cwords=0;
		int ch=0;
		int linecount=0;
		while((x=fr.read())!=-1){
			ch++;
			if (x==' ')
			Cwords++;
			if(x=='\n')
				linecount++;
			  
		}
		System.out.println("no of words: "+(Cwords+linecount-1));
		System.out.println("no of characters: "+(ch));
		fr.close();
		
	}
	

}
