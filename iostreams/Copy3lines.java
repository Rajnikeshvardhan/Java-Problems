package iostreams;

import java.io.*;

public class Copy3lines {

	public static void main(String[] args) throws IOException{
		         BufferedReader fr = new BufferedReader(new FileReader("C://Users//DAC-User34//Desktop//IOstrems//Mainofcopy1.txt"));
		         BufferedWriter fw1 = new BufferedWriter(new FileWriter("C://Users//DAC-User34//Desktop//IOstrems//Copy3Lines.txt"));
		         
		         
			String x;
			int c=0;
		
		
			while((x=fr.readLine())!=null) {
				if (!x.isEmpty()) {
					if(c<5) {
						
						fw1.write(x);
						fw1.write('\n');
						
						
						System.out.println(x);
						c++;
						}
                    
                }
							}
			fr.close();
			fw1.close();
			}
			

		
	}


