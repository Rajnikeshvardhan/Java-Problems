package multithreading;

public class PrimeFibThread {
	int n,c1=0,c2=0;
	public PrimeFibThread(int n) {
		this.n = n;
	}
	
	
	public  void fibonacci_series(){
			int a=0;
			int b=1;
			int sum=0;
			for (int i=1;i<=n;i++){
				if(sum>1000)
					break;
				else {
					
					
				
					System.out.print(sum+" ");
					a=b;
					b=sum;
					sum=a+b;
				}

			}
			System.out.println();
		}
	
	public void primenumber() {
		int c=0;
		for(int i=2;i<n;i++) {
			for(int j=2;j<(i/2)+1;j++) {
				if(i%j==0) {

					break;
				}
			}
			if(c==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(c1+" ");
	
	
	
}
}

