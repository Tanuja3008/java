package com.Programming_Practice;
import java.util.Scanner;

public class EvenorOddUsingArithametic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Numbare");
		int numbare = scanner.nextInt();
		
			if((numbare/2)*2==numbare) {
				System.out.println(numbare + " is Even Numbare ");
			}
			else {
				System.out.println(numbare + " is Odd Numbare ");
			}	
			scanner.close();
	}

}