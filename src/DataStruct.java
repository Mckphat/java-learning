package helloWorld;
import java.util.*;

public class DataStruct {

	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Part 1: Write a program to sum all the values of a given Array
		 */
		
		//make a given array
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for (int i = 0; i< array.length; i++) {
			sum = array[i] + sum;
		}
		System.out.println("The sum is: " + sum);
		
		
		/**
		 * Part 2: What is the output of this given example?
		 */
		double[ ] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i<exampleArray.length; i++){
             if (exampleArray[ i ] > maximum) {
                  maximum = exampleArray[ i ];
                  index = i;
             }
        }
        System.out.println("The output is: " + index);
        DataStruct.toPower();
        
		
	}
	
	/**
	 * Part 3: Create a toPower static method 
	 * @return 
	 */
	
	public static int toPower() {
		System.out.println("Enter a size and power: ");
		int base = keyboard.nextInt();
		int exponent= keyboard.nextInt();
		//the base is going to be "size" where each element in the array 
		//is raised to some power 
		//return the elements after being raised to that power 
		/*
		 * size = 4, power = 2, results = {0,1,4}
		 */
		
		//do a loop maybe 
		int results = 0;
		//int [] result = new int[0];
		for(int i = 0; i<base;i ++) {
			results = i;
			results = (int) Math.pow(i, exponent);
			//System.out.print(results + " ");
			
			//store i in an array
			//result[i] = results;
			System.out.print(results + " ");
			
			
		}
		return results;
		
	}
}



























	

	