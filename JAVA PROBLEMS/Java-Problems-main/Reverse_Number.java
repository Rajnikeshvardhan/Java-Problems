class Reverse_Number{
	public static void main(String[] args) {
		int random_number = 1+((int) (Math.random()*10000));
		int random_number1=random_number;
		int reverse=0;
		while(random_number>0){
			int last=random_number%10;
			reverse=reverse*10+last;
			random_number=random_number/10;
		}
		System.out.println("reverse of "+random_number1+" is "+reverse);
	}
}