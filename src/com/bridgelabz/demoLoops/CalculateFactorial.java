package com.bridgelabz.demoLoops;
import java.util.Scanner;
public class CalculateFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 int factorial = 1;
	System.out.println("enter the number: ");
	int N = sc.nextInt();
	for (int i=1; i<=N; i++) {
    factorial = factorial*i;
	}
	System.out.println("factorial of " +N+ " = " +factorial);
	sc.close();
	}
}
