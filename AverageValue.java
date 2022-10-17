package Demo;

import java.util.Scanner;

public class AverageValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of numbers: ");
		int count = sc.nextInt();
		
		int sum=0;
		int number;
		System.out.println("Enter the numbers one by one: ");
		for(int n=1; n <=count; n++) {
			number = sc.nextInt();
		sum = sum+number;
		}
		System.out.println(sum);
		System.out.println("Average of " +count+ " numbers entered is :" + (sum/count));
		
		sc.close();
	}

}
