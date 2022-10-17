package Demo;

import java.util.Scanner;

public class CurrencyConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the SEK value: ");
		int sekValue = sc.nextInt();
		
		double oneUSD = 0.088;

		double usdValue = sekValue * oneUSD;
		
		System.out.println(sekValue+ " in USD is: " + usdValue);
		
		
		sc.close();
	}

}
