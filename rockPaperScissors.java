import javax.swing.*;  
import java.util.Random;


public class rockPaperScissors {
		public static void main(String[] args){
			Random randomvalue = new Random();
			int computer_selection = randomvalue.ints(1, 4).findFirst().getAsInt();
			//max plus 1
			

			int selection = Integer.parseInt(JOptionPane.showInputDialog("Enter scissors (1), rock (2) or paper (3)"));	
			//we convert a string into an integer
			if (selection==1)
			{
				System.out.println("Your choice is 1: scissors");
			}
			else if	(selection == 2)
			{
				System.out.println("Your choice is 2: rock");
			}
			else if (selection == 3)
			{
				System.out.println("Your choice is 3: paper");
			}
			else
			{
				System.out.println("Incorrect selection");
			}
			if (computer_selection==selection)
			{
				System.out.println("It's a tie");
			}
			else if	(selection == 2){
				if (computer_selection < 2) {
					System.out.println("You win!");
					}
					else {
					System.out.println("You lose!");
					}}
				else if (selection == 1) {
				if (computer_selection == 2) {
					System.out.println("You lose!");
					}
					else {
					System.out.println("You win!");
					}}
				else if (selection == 3) {
					if (computer_selection == 2) {
						System.out.println("You win!");
						}
						else {
						System.out.println("You lose!");
						}}
			if (computer_selection==1)
			{
				System.out.println("The computer had 1: scissors");
			}
			else if	(computer_selection == 2)
			{
				System.out.println("The computer had 2: rock");
			}
			else if (computer_selection == 3)
			{
				System.out.println("The computer had 3: paper");
			}
				}
			
}
		
	
		
		