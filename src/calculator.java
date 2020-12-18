package helloWorld;
import java.util.*;

public class calculator {
	//Creating the basic commands of a calculator using OOP 
	private int result; 
	private static double x; 
	private static double y; 
	//private char operators; 
	
	//Create constructors 
	public calculator() {
		result = 0;
	}
	//addition class x+y
	public double addition(double x, double y) {
		return x + y;
	}
	//subtraction
	public double subtraction(double x, double y) {
		return x - y;
	}
	//multiplication
	public double multiply(double x, double y) {
		return x*y;
	}
	//divison
	public double division(double x, double y) {
		return x/y;
	}
	//square 
	public double square(double x) {
		return x*x;
	}
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2;
		char operators;
		double result; 
		calculator calc = new calculator();
		
		System.out.println("Welcome to Basic Calculator. Enter two numbers: ");
		num1 = keyboard.nextInt();
		num2 = keyboard.nextInt();
		System.out.println("Enter an operation (+, -, *, /, ^): ");
		operators = keyboard.next().charAt(0);
		//create switch statement
		switch(operators) {
		case '+': result = calc.addition(num1, num2);
			break;
		case '-': result = calc.subtraction(num1, num2);
			break;
		case '*': result = calc.multiply(num1, num2);
			break;
		case '/': result = calc.division(num1, num2);
			break;
		case '^': result = calc.square(num1);
			break;
		default: System.out.println("ERROR!!!!!");
			return;
		}
		System.out.println("Result is: " + result);
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	

}
