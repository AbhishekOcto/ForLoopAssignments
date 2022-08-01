package com.bridgelabz.demoLoops;

public class DivisibilityBy3and5 {

	public static void main(String[] args) {
		System.out.println("The numbers which are divisible by both 3&5 are: ");
		for ( int i = 1; i <= 50; i++ ) {
			if ((i%3 == 0) && (i%5 == 0)) {
				System.out.println(+i);
			}
		}

	}

}
