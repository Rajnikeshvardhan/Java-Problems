class GCD{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		GCD g=new GCD();	
		System.out.println(g.fun(a,b));
	}
	int fun(int a,int b){
		int rem=a%b;
		if(rem==0)//or a%b==0
			return b;
		else{
			return fun(b,rem);// or fun(b,a%b)



			
		}
		
	}

}