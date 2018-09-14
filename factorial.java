package factorial;

import java.util.Scanner;

public class factorial {
	public static void main (String [] args )
	{		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a positive integer:");
		int num = s.nextInt(); 
		int i;
		int value = 1;
		for (i=1;i<=num;i++) {
			//start, ends loop when false, increment per loop
			value=value*i;
		}
		System.out.println("Factorial of "+ num + " is: " + value); 

	}
}
