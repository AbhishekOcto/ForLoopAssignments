package com.bridgelabz.demoLoops;
import java.util.Scanner;
public class Array1 {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = 0, i = 0;
	
	System.out.println("Enter the array length: ");
	n = sc.nextInt();
	int array[] = new int [n];
	System.out.println("Enter the array elements: ");
	for (i = 0; i < n; i++) {
		array[i] = sc.nextInt();
			
	}
	
	for (i = 0; i < n; i++) {
		System.out.print(+array[i]);
	}
	
	}
	
}
