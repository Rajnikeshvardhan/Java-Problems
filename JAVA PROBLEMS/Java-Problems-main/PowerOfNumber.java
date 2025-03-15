// Write a program to calculate the power of a number using a loop.
class PowerOfNumber{
	public static void main(String[] args) {
		int random_number = 1+((int) (Math.random()*101));
		int power=1;
		int n=0;
		while(n<2){
			power=power*random_number;
			n+=1;

		}
		System.out.println("Power of " + random_number + " is "+ power );
	}
}