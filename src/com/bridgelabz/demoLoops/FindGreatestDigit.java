package com.bridgelabz.demoLoops;
import java.util.Scanner;
public class FindGreatestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		sc.close();
		
		int max = 0;
		while (number > 0) {
			int rem = number % 10;
			if (rem > max) {
				max = rem;
			}
		number = number/10;
		}
		System.out.println("Largest digit in the gievn number is: " +max);

	}

}
