package helloWorld;
import java.util.*;
public class pet {
	private String name;
	private int age;
	private String location;
	private String type;
	
	//constructor with parameters
	public pet(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	//default constructor 
	public pet() {
		this.name = this.location = this.type = "none";
		this.age = 1; //by default its should be 1
	}
	//do setters and getters 
	public void setName(String name ) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return this.type;
	}
	public String toString() {
		return "Name: " + this.name + "\n" + "Age: " + this.age +
				"\n" + "Location: " + this.location + "\n" + "Type: " + this.type;
	}
	
	public static void main(String[] args) {
		//Create new pet objects 
		pet dog = new pet ("Vivi", 5, "South Carolina", "Maltese");
		pet cat = new pet("Jotaro", 5, "South China", "Calico" );
		pet snake = new pet("Orochimaru", 500, "Japan", "white-snake");
		System.out.println(dog.toString());
		System.out.println();
		System.out.println(cat.toString());
		System.out.println();
		System.out.println(snake.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
