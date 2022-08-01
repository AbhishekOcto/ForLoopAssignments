package com.bridgelabz.demoLoops;
import java.util.Scanner;
public class ForLoop_TableofN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int N = sc.nextInt();
		System.out.println("The table of N is: ");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(N+ " * " +i+ " = " +N*i);
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
