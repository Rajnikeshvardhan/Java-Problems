//Create a class Person with attributes name, age and country. Implement methods to set and get these attributes. Create an object of this class, set its attributes, and print out the details.

package encapsulation;

public class Person {
private String name;
private int age;
private String country;

public Person( String name, int age,String country){
	this.name=name;
	this.age= age;
	this.country=country;
}
public void getData() {
	System.out.println("Name: "+name+", Age: "+age+", Country: "+country);
}
public static void main(String[] args) {
	Person s=new Person("nikesh",22,"India");
	s.getData();
}
}