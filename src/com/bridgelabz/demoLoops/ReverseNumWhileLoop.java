package com.bridgelabz.demoLoops;

public class ReverseNumWhileLoop {

	public static void main(String[] args) {
		int n = 1583, r, sum = 0;
		while (n>0) {
			r = n%10;
			System.out.print(r);
			sum = sum + r;
			n = n/10;
		}
		System.out.println("\t"+sum);
	}

}
