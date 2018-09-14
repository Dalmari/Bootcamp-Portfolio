package identicalArrays;
import java.util.Arrays;
import java.util.Scanner;
public class identicalArrays {
	public static void main (String [] args )
	{
	    Scanner input = new Scanner(System.in);
        //Get  user  input for first array;
        System.out.println("How many numbers do you want to enter in array 1?");
        int num1 = input.nextInt();
        int array1[] = new int[num1];
        System.out.println("Enter the " + num1 + " numbers now.");
        for (int i = 0 ; i < array1.length; i++ ) {
           array1[i] = input.nextInt();
        }

        System.out.println("These are the numbers you have entered in array 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        
         //Get  user  input for second array;
        System.out.println("\nHow many numbers do you want to enter in array 2?");
        int num2 = input.nextInt();
        int array2[] = new int[num2];
        System.out.println("Enter the " + num2 + " numbers now.");
        for (int j = 0 ; j < array2.length; j++ ) {
            array2[j] = input.nextInt();
         }

         System.out.println("These are the numbers you have entered in array 2:");
         for (int j = 0; j < array2.length; j++) {
             System.out.print(array2[j] + " ");    
        }
         //Are they equal:
         boolean retval = Arrays.equals(array1, array2);
         if (retval == true)
        	 {
        	 System.out.println("\nThe two arrays are identical.");
        	 }
         else
         {
        	 System.out.println("\nThe two arrays are not identical.");
    	 }
                 	 }

}