package com.bridgelabz.demoLoops;
import java.util.Scanner;
/*  
 * @author Abhishek 
 * 02.08.22
 * */
public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int originalNumber, remainder, result = 0;
		 // taking the user number
		 System.out.print("Enter the number: ");
            int number = sc.nextInt();
	        originalNumber = number;
            sc.close();
	        while (originalNumber > 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber = originalNumber/10;
	        }

	        if(result == number) {
	            System.out.println(number + " is an Armstrong number.");
	        }else {
	            System.out.println(number + " is not an Armstrong number.");
	    }
	}
}
