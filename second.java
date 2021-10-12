import java.util.Scanner;\

class Student{
	String firstName;
	String lastName;
	int age;
	float weight;
	short course;


	public Student(String firstName, String lastName,int age, float weight, short course){
		this.firstName = firstName;
		this.lastName;
		this.age = age;
		this.weight = weight;
		this.course = course;
	}
}

public class Main{
	public static void main(String[] args){
		SomeClass someCLass = new SomeClass();
		Student student = new Student(firstName:"Tom",lastName:"Tompson",age:"20",weight:67.7f,(short)2);
		System.out.println(student.age);
	}
}