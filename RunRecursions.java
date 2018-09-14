import java.util.Scanner;

public class RunRecursions {
	public static void main(String args[])
    {
      System.out.println("===Compulsory Task 1===");
		
	  Factorial object = new Factorial();
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the integer you'd like the factorial of:");
      int value = input.nextInt();
      input.nextLine();  
	 // int value = 3;	//update  value or insert scanner to request value from user
      int a = object.fact(value);  		
      System.out.println("The factorial of the number \'"+value+"\'+ is : " + a);
  
      StringRev obj=new StringRev();
      System.out.println("Enter the word you'd like to print in reverse:");
      String word = input.nextLine();
      //System.out.println(word);
      //String str = "Headlight";		//update  value or insert scanner to request value from user
      System.out.println("Reverse of \'"+word+"\' is :'"+obj.reverse(word)+"\'");    
      
      Fibo item = new Fibo();
      System.out.println("Enter the number of Fibonacci numbers you'd like to print");
      int x = input.nextInt();
      input.nextLine();  
      //int x = 14;		//update  value or insert scanner to request value from user
      int b = item.fibonacci(x); 	
      System.out.println("The fibonacci number of \'"+x+"' is : "+b);
      
      //Print our the first n fibonacci numbers // Compulsory Task 2
      System.out.println("===Compulsory Task 2===");
      System.out.println("The first " + x + " Fibonacci numbers are:");
      for (int i=1; i < x+1; i++){
          System.out.println(item.fibonacci(i));}
      
      
      replace term = new replace();
     // Scanner input = new Scanner(System.in);
      //Get  user  input for the phrase to search from;
      System.out.println("Enter String: ");
      String phrase = input.nextLine();
     // System.out.println(phrase);
            
      System.out.println("Enter word/characters to find: ");
      String find = input.next();
     // System.out.println(find);
      
      System.out.println("Enter word/characters to replace with: ");
      String insert = input.next();
      
      input.close();
      
      String output = term.replace1(phrase, find, insert); 
      System.out.println(output);
      }   
    }    
