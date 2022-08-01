package com.bridgelabz.demoLoops;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		System.out.println("evens \t odds");
		int j=1;
		int i =1;
		int sum1 = 0;
		int sum2 = 0;
		for(i=1; i<=20; i++) {
			j++;
			if (i%2==0) {
			int even = i;
			sum1 = sum1+i;
			}
			else {
				int odd = j;
				sum2 = sum2+j;
			}
			System.out.println(i+ "\t" +j);
		}
		System.out.println(sum1+ "\t" +sum2);
		// TODO Auto-generated method stub

	}

}
