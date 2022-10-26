package edu.wit.cs.comp1000;

import java.util.Scanner;//Scanner is in the java.util package


public class PA1a {
	// Class identifier here. 

	
	public static void main(String[] args) {
		// TODO: write your code here!
Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter yards, feet and inches.
		
		System.out.println("Enter the number of yards:");
		int yards = input.nextInt();
		
		System.out.println("Enter the number of feet:");
		int feet = input.nextInt();
		
		System.out.println("Enter the number of inches:");
		int inches = input.nextInt();
		
		//Compute total number of inches.
		
		int Sum = (yards*36 + feet*12 + inches);
		
		//Display results.
		System.out.print("The total number of inches is:" + Sum);

	}

}
