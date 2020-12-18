package helloWorld;
import java.util.*;
/*
 * By: Kannika Phatsavong
 */

public class Anime {
	private String name;
	private int age;
	private String pronoun;
	private boolean isDead;
	
	//Constructors with parameters  
	public Anime(String name, int age, String pronoun, boolean isDead){
		this.name = name;
		this.age = age;
		this.pronoun = pronoun;
		this.isDead = isDead;
	}
	//Default Constructor 
	public Anime() {
		this.name = this.pronoun = "noun";
		this.age = 13;
		this.isDead = false;
	}
	//Create setters and getters
	public void setName(String name) {
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
	public void setPronoun(String pronoun) {
		this.pronoun = pronoun;
	}
	public String getPronoun() {
		return this.pronoun;
	}
	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}
	//boolean method that returns if the character is alive or not
	public boolean isDead() {
		if (isDead == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//method that returns string
	public String toString() {
		return "Name of character: " + this.name + "\n" + "Their pronoun: " + this.pronoun + "\n"
				+ "Their age: " + this.age + "\n" + "Are they dead? " + this.isDead;
	}
	
	public static void main(String[] args) {
		//generate some anime characters
		Anime demon_slayer = new Anime("Tanjiro", 15, "he/him", false);
		Anime one_piece = new Anime("Luffy", 19, "he/him", false);
		Anime promise_neverland = new Anime("Connie", 6, "her/she", true);
		Anime naruto = new Anime("Itachi", 21, "he/him", true);
		
		System.out.println(demon_slayer.toString());
		System.out.println();
		System.out.println(one_piece.toString());
		System.out.println();
		System.out.println(promise_neverland.toString());
		System.out.println();
		System.out.println(naruto.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
