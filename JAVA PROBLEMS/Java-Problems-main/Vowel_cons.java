import java.util.Scanner;
class Vowel_cons{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		Vowel_cons v=new Vowel_cons();
		boolean t=v.is_Vowel(ch);
		System.out.println(t?ch+" is vowel":ch+" is consonant");
	}
	boolean is_Vowel(char ch){
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			return true;
		else
			return false;
	}
}