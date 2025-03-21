//2. Write a program to read the same program file and write it to another file with the lines number added before each line, starting from 1.
package iostreams;

import java.io.*;

public class Copy {

	public static void main(String[] args) throws IOException{
         BufferedReader fr = new BufferedReader(new FileReader("C://Users//DAC-User34//eclipse-workspace//javawork//src//iostreams//Copy.java"));
         BufferedWriter fw1 = new BufferedWriter(new FileWriter("C://Users//DAC-User34//Desktop//IOstrems//Mainofcopy1.txt"));
         
         
	String x;
	while((x=fr.readLine())!=null) {
		
		fw1.write(x);
		fw1.write('\n');
	}
	fr.close();
	fw1.close();
	}

}
