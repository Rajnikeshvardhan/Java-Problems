package encapsulation;

import java.util.Scanner;

//Define a class of type Student that has rollno, name and age as private data members. Define SetData() and GetData() as public member functions with appropriate functionality. Write a program that declares 2 student objects, initializes the first at run-time and second by reading from console, and then displays both student’s data.


public class Student {
	private int rollno;
	private String name;
	private int age;
	public Student(int rollno, String name, int age){
		this.rollno=rollno;
		this.name=name;
		this.age= age;
	}
	public void getData() {
		System.out.println("Name: "+name+" rollno: "+rollno+" Age: "+age);
	}
	public static void main(String[] args) {
		Student s=new Student(123,"nikesh",22);
		s.getData();
		System.out.println("--------------------------------------------------");
		System.out.println("Enter details: ");
		Scanner sc=new Scanner(System.in);
		int n=2;
		Student[] s1 = new Student[n];
		for( int i=0;i<2;i++) {
		s1[i]= new Student(sc.nextInt(),sc.next(),sc.nextInt());
		}
		for( int i=0;i>2;i++)
		s1[i].getData();
		
		sc.close();
		
	}
	
}
