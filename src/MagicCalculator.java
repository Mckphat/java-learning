package helloWorld;
import java.util.*;
public class MagicCalculator extends calculator {
	//no real constructors to define so lets go to functions
	
	//find squareroot 
	public double sqrRoot(double x) {
		return Math.sqrt(x);
	}
	//find sin
	public double sin(double x) {
		return Math.sin(x);
	}
	//find cosin
	public double cos(double x) {
		return Math.cos(x);
	}
	//find tangent
	public double tan(double x) {
		return Math.tan(x);
	}
	//find factorial 
	public double factorial(double x) {
		if (x == 0) {
			return 1;
		}
		else {
			return x*factorial(x-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call all the methods from calculator
		MagicCalculator magic = new MagicCalculator();
		double num1, num2, result;
		String operators;
		System.out.println("Welcome to a more advace calculator! Enter a number: ");
		num1 = keyboard.nextInt();
		System.out.println("Choose an operator you want to do (sqrt, sin, cos,tan,!)");
		operators = keyboard.next();
		switch(operators) {
		case "sqrt": result = magic.sqrRoot(num1);
		break;
		case "sin": result = magic.sin(num1);
			break;
		case "cos": result = magic.cos(num1);
			break;
		case "tan": result = magic.tan(num1);
			break;
		case "!": result = magic.factorial(num1);
			break;
		default: System.out.println("ERROR!!!!!");
			return;
		}
		System.out.println("Result is: " + result);
		
			
		

	}

}
