package averageNumber;
//import javax.swing.*;
import java.util.Scanner;	
public class averageNumber {
	public static void main (String [] args )
	{
		double pos = 0, neg = 0, sum = 0;
		int counter = 0, input = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a series of values (0 to quit): ");
	    while ((input = s.nextInt()) != 0) {

	        if (input != 0)
	            sum += input;
	            counter++;

	        if (input > 0)
	            pos ++;
	        else
	            neg ++;
		  }

	    if (counter > 0) {
	        double average = sum / counter;
   
	        System.out.println("Total number of integers entered before 0 is " + counter);
	        System.out.println("Total positive numbers entered is " + pos);
	        System.out.println("Total negative numbers entered is " + neg);
	        System.out.println("Total sum of the numbers entered is " + sum);
	        System.out.println("The average value is: " + average);
	        };
}}

