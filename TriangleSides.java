package Demo;

import java.util.Scanner;

public class TriangleSides {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		
		
		System.out.println("The first number is: ");
		int a = sc.nextInt();
		System.out.println("The second number is: ");
		int b = sc.nextInt();
		System.out.println("The third number is: ");
		int c = sc.nextInt();
		
		if( a+b>c && b+c>a && c+a>b) {
			System.out.println("Numbers entered are sides of a triangle.");
		}else {
			System.out.println("Numbers entered are not sides of a triangle.");
		}

		
		
		sc.close();
	}

}

