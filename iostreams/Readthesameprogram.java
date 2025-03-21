package iostreams;

import java.io.*;

public class  Readthesameprogram{
	public static void main(String[] args) throws IOException {
		File file =new File("C://Users//DAC-User34//Desktop//IOstrems//Demo.txt");
		FileWriter fw = new FileWriter(file,true);
		fw.write("\nNikesh");
		fw.close();
		
	}
}