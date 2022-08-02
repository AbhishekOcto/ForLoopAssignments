package com.bridgelabz.demoLoops;

public class EvenOddSum {

	public static void main(String[] args) {
		
		int i, sumOdd = 0, sumEven = 0;
		
		for( i = 1; i <= 20; i++ ) {
			if( i%2 != 0 ) {
				System.out.print(i);
				sumOdd = sumOdd + i;
			}else {
				System.out.println("\t" +i);
			sumEven = sumEven + i;
			}
		}
       System.out.println("total \t total");
		System.out.println(sumOdd+ "\t" +sumEven);
	}

}
