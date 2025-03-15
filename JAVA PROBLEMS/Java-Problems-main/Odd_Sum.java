//Write a program to find the sum of all odd numbers between 1 and 50
class Odd_sum{
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<50;i++){
			if(i%2!=0){
				sum=sum+i;
			}
		}
		System.out.println("Sum of all odd number b/w 1 to 50: "+sum);
	}
}

