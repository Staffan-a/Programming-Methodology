/*
 * File:
 * Name: 
 * Section Leader: 
 * -----------------------------
 * 
 */

import acm.program.*;

public class Section extends ConsoleProgram {
	public void run() {
		
		int fib1 = 0;
		int fib2 = 1;
		
		println ("This programme lists the Fibonacci sequence.");
		
		while (fib1 < MAX_TERM_VALUE) {
			println(fib1);
			int fib3 = fib1+fib2;
			fib1 = fib2;
			fib2 = fib3;
			
		}
	}	
		private static final int MAX_TERM_VALUE = 10000;
	
}
