package Demo;

import java.util.Scanner;

public class PrintOutputGiven {

	public static void main(String[] args) {
		
			System.out.println("XXXXX");
			System.out.println("X   X");
			System.out.println("X   X");
			System.out.println("XXXXX");
			
			
			HollowPatterns();
	}
	
	
	

		static void HollowPatterns() {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the number of rows: ");
			int n = sc.nextInt();
			
			for ( int i=1;i <=n;i++) {
				for ( int j=1;j <=n;j++) {
					if(i==1 || j==1 || i==n ||j==n) {
					System.out.print("X");
					}else {
						System.out.print(" ");
					}
				}
				
				System.out.println();
			}
			sc.close();
		}
		
    }


