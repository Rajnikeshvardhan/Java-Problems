package multithreading;

public class PrimeNumberss {
public static void main(String[] args){
		int n=100;
		for(int i=2;i<n;i++) {
			int  c=0;
			for(int j=2;j<(i/2)+1;j++) {//4/2=2 not entering into the loop (i/2)+1 =4/2+1=3
				if(i%j==0) {
					c++;
					break;
				}
			}
			if(c==0) {
				System.out.println(i);
			}
		}
	
	}
}

