class SingleDigit_sum{
	int sum=0;
	public static void main(String[] num) {
		int n=Integer.parseInt(num[0]);
		SingleDigit_sum s=new SingleDigit_sum();
		s.Digit_sum(n);

		}

		void Digit_sum(int n){
			while(n>0){
				int rem=n%10;
				sum=sum+10;
				n=n/10;
			}
			System.out.println(sum);
			Digit_count(sum);
		}
		void Digit_count(int c){
			int temp=c;
			int count=0;
			while(c>0){
				int rem=c%10;
				count++;
				c=c/10;
			}
			if(count>1)
				System.out.println(temp);
			
		}
}