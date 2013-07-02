/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		int n = readInt("Enter a number: ");
		int count = 0;
		
		while (n != 1) {
		int n2 = n;
			if ((n % 2) == 0){
				count++;
				n = (n/2);
				println(n2 + " is even, divide by 2, new number is " + n);
			} else {
				count++;
				n = (n*3)+1;
				println(n2 + " is odd, multiply by 3 and add 1, new number is " + n);
			}
		
		}
		println("It took " + count + " steps to get to 1");	
	}
}

