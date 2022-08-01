package com.bridgelabz.demoLoops;

import java.util.Scanner;

public class SumOfTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int N = sc.nextInt();
		System.out.println("The table of N is: ");
		int i, sum = 0;
		for (i = 1; i <= 10; i++) {
			System.out.println(N+ " * " +i+ " = " +N*i);	
		
			sum = sum + N*i;
		System.out.println("The sum of Table Numbers is: "+sum);
		sc.close();
		}
		
		// TODO Auto-generated method stub

	}

}
