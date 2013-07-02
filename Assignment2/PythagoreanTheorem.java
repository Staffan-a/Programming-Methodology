/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter values to compute the Pythagorean theorem:");
		double a = readDouble("Enter a: ");
		double b = readDouble("Enter b: ");
		double a1 = a * a;
		double b1 = b * b;
		double ab = a1 + b1;
		double c = Math.sqrt(ab);
		
		println("c is: " + c );
	}
}
