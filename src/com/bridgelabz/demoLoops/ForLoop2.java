package com.bridgelabz.demoLoops;
import java.util.Scanner;
public class ForLoop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the start no. ");
		int A = sc.nextInt();
		System.out.println("enter the end no. ");
		int B = sc.nextInt();
		int i;
		for (i = A; i <= B; i++) {
			System.out.println(+i);
			sc.close();
		}
		
		// TODO Auto-generated method stub

	}

}
