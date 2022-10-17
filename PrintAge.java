package Demo;

import java.util.*;

public class PrintAge {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How old are you?");
		System.out.print("Please enter the age here: ");
		int age = input.nextInt();
		System.out.println("The user is "+age+" year old.");
		
		
		/*
		System.out.println("What is your occupation?");
		System.out.print("Enter your occupation here: ");
		String occupation = input.nextLine();
		System.out.println("Your occupation is: " + occupation + "." );
		
		*/
		input.close();
		

	}

}
