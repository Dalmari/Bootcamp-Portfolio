package bookstore;
import java.sql.*;
import java.util.Scanner;
//import java.util.ArrayList;

public class clerk {
	public static void main ( String [] args ) throws SQLException 
	{
	Scanner s = new Scanner(System.in);
	//	eBookstore eStore = new eBookstore();
	
//	int y=0;
	int user_choice;
	int user_sub = 0;
	

	
	try (
	// Step 1: Allocate a database 'Connection' object
	Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/ebookstore?useSSL=false","myuser","5969");
	// Step 2: Allocate a 'Statement' object in the Connection
	Statement stmt = conn . createStatement ();
	) 
	{
	 	
		//display menu to user, ask for his choice, loop
		boolean mainLoop = true;
		while(mainLoop) 
		{		
			//display database for user to view;
			String strSelect = "SELECT * FROM books" ;
			System . out . println ( "DATABASE:\n=====================" );
			ResultSet rset = stmt . executeQuery ( strSelect );
			while ( rset . next ()) {
			System . out . println ( rset . getInt ( "id" ) + "|| "
			+ rset . getString ( "title" ) + ", BY  "
			+ rset . getString ( "author" ) + ", "
			+ rset . getInt ( "qty" ));
			}
			System.out.println("===================================");
		 	System.out.print("SELECT COMMAND:\n");
	        System.out.println("1) Enter new book into the database");
	        System.out.println("2) Update book information");
	        System.out.println("3) Delete books from the database");
	        System.out.println("4) Search for a book");
	        System.out.println("5) Quit");
	        System.out.println();
	        System.out.print("Enter choice [1-5]: ");
	        user_choice = s.nextInt();
	        s.nextLine();
	        switch (user_choice) 
	       	{
	            case 1: 
	            	System.out.println("ADD BOOK\t");
	            	System.out.println("Enter the book title:\t");
	            	String title = s.nextLine();
	            	System.out.println("Author's name:\t");
	            	String author = s.nextLine();
	            	System.out.println("Enter the (unique) book ID:\t");
	            	int Nid = s.nextInt();
	              	System.out.println("Enter stock quantity for " + title);
	            	int qty = s.nextInt();
	            	try {
	            	String sqlInsert = "INSERT INTO books values"+ "(" + Nid + ", '" + title + "' , '" + author + "' ," + qty + ")";
	            	int countInserted = stmt . executeUpdate ( sqlInsert );
	            	System . out . println ( countInserted + " records inserted.\n" );
	            	}
	       			catch ( SQLException ex ) {
	       				ex . printStackTrace ();
	       			 System.out.println(ex);}
	            	break;
	            case 2:
	            	System.out.println();
	            	System.out.print("SELECT SUBCOMMAND:\n");
	    	        System.out.println("1) Lookup and edit based on book ID (where ID is to remain as is)");
	    	        System.out.println("2) Lookup and edit based on book Title (where Title to remain as is)");
	    	        System.out.println();
	    	        System.out.print("Enter choice [1 or 2]: ");
	    	        user_sub = s.nextInt();
	    	        s.nextLine();
	    	        switch (user_sub)
	            		{
	            		case 1:
	            			System.out.println("EDIT ENTRY\t");
	            			System.out.println("Enter the ID of the book entry you'd like to edit:\t");
	            			Nid = s.nextInt();
	            			s.nextLine();
	            			System.out.println("Update the book title (re-enter if no changes should be made):\t");
	            			title = s.nextLine();
	            			System.out.println("Update the author's name (re-enter if no changes should be made):\t");
	            			author = s.nextLine();
	            			System.out.println("Update stock quantity for " + title + "(re-enter if no changes should be made):\t");
	            			qty = s.nextInt();
	            			String strUpdate = "UPDATE books SET title = '"+ title +"', author = '"+ author + "', qty ="+ qty +" WHERE id =" +Nid;
	            			System . out . println ( "The UPDATE is: " + strUpdate );
	            			int countUpdated = stmt . executeUpdate ( strUpdate );
	            			System . out . println ( countUpdated + " records affected." );
	            			strSelect = "SELECT * FROM books WHERE id ="+Nid ;
	            			ResultSet bset = stmt . executeQuery ( strSelect );
	            			while ( bset . next ()) { 
	            				System . out . println ( bset . getInt ( "id" ) + ", "
	            						+ bset . getString ( "author" ) + ", "
	            						+ bset . getString ( "title" ) + ", "
	            						+ bset . getInt ( "qty" ));
	            						}
	            			break;
	            		case 2:
	            			System.out.println("EDIT ENTRY\t");
	            			System.out.println("Enter the Title of the book entry you'd like to edit:\t");
	            			title = s.nextLine();
	            			System.out.println("Update the book ID, (re-enter if no changes should be made):\t");
	            			Nid = s.nextInt();
	            			s.nextLine();
	            			System.out.println("Update the author's name (re-enter if no changes should be made):\t");
	            			author = s.nextLine();
	            			System.out.println("Update stock quantity for " + title + "(re-enter if no changes should be made):\t");
	            			qty = s.nextInt();
	            			strUpdate = "UPDATE books SET id = "+ Nid +", author = '"+ author + "', qty ="+ qty +" WHERE title ='" +title+"'";
	            			System . out . println ( "The UPDATE is: " + strUpdate );
	            			countUpdated = stmt . executeUpdate ( strUpdate );
	            			System . out . println ( countUpdated + " records affected." );
	            			strSelect = "SELECT * FROM books WHERE title ='"+title+"'" ;
	            			ResultSet cset = stmt . executeQuery ( strSelect );
	            			while ( cset . next ()) { 
	            				System . out . println ( cset . getInt ( "id" ) + ", "
	            						+ cset . getString ( "author" ) + ", "
	            						+ cset . getString ( "title" ) + ", "
	            						+ cset . getInt ( "qty" ));
	            						}break;
	            		}
	    	        break;
	            	case 3:
	            		System.out.println();
	            		System.out.print("SELECT SUBCOMMAND:\n");
		    	        System.out.println("1) Lookup and delete using book ID");
		    	        System.out.println("2) Lookup and delete using book Title");
		    	        System.out.println();
		    	        System.out.print("Enter choice [1 or 2]: ");
		    	        user_sub = s.nextInt();
		    	        s.nextLine();
		    	        switch (user_sub)
		            		{
		            		case 1:
		            			System.out.println("DELETE ENTRY\t");
		            			System.out.println("Enter the ID of the book entry you'd like to delete:\t");
		            			Nid = s.nextInt();
		            			s.nextLine();
		            			
		            			String sqlDelete = "DELETE FROM books WHERE id =" +Nid;
		            			System . out . println ( "DELETED: " + Nid);
		            			int countDeleted = stmt . executeUpdate ( sqlDelete );
		            			System . out . println ( countDeleted + " records deleted.\n" );
		            			break;
		            		case 2:
		            			System.out.println("DELETE ENTRY\t");
		            			System.out.println("Enter the Title of the book entry you'd like to delete:\t");
		            			title = s.nextLine();
		            			sqlDelete = "DELETE FROM books WHERE title = '" +title+ "'";
		            			System . out . println ( "DELETED: " + title );
		            			countDeleted = stmt . executeUpdate ( sqlDelete );
		            			System . out . println ( countDeleted + " records deleted.\n" );
		            			break;
		            		}
		    	        break;
		            	case 4:
		            		System.out.println();
		            		System.out.print("SELECT SUBCOMMAND:\n");
			    	        System.out.println("1) Search using Title");
			    	        System.out.println("2) Search using Author");
			    	        System.out.println();
			    	        System.out.print("Enter choice [1 or 2]: ");
			    	        user_sub = s.nextInt();
			    	        s.nextLine();
			    	        switch (user_sub)
			            		{
			            		case 1:
			            			System.out.println("SEARCH ENTRY\t");
			            			System.out.println("Enter the Title of the book you'd like to lookup:\t");
			            			title = s.nextLine();
			            			strSelect = "SELECT * FROM books WHERE title LIKE '%"+ title + "%'" ;
			            			ResultSet sset = stmt . executeQuery ( strSelect );
			            			while ( sset . next ()) { // Move the cursor to the next row
			            				System . out . println ( sset . getInt ( "id" ) + ", "
			            						+ sset . getString ( "author" ) + ", "
			            						+ sset . getString ( "title" ) + ", "
			            						+ sset . getInt ( "qty" ));}
			            			System.out.println("###Press ENTER to return to Menu###");
			            			s.nextLine();
			            			break;
			            		case 2:
			            			System.out.println("SEARCH ENTRY\t");
			            			System.out.println("Enter the name of the author:\t");
			            			author = s.nextLine();
			            			strSelect = "SELECT * FROM books WHERE author LIKE '%"+ author + "%'" ;
			            			ResultSet tset = stmt . executeQuery ( strSelect );
			            			while ( tset . next ()) { // Move the cursor to the next row
			            				System . out . println ( tset . getInt ( "id" ) + ", "
			            						+ tset . getString ( "author" ) + ", "
			            						+ tset . getString ( "title" ) + ", "
			            						+ tset . getInt ( "qty" ));}
			            			System.out.println("###Press ENTER to return to Menu###");
			            			s.nextLine();
			            			break;
			            			}
			    	        break;
		            	case 5:
		            		mainLoop = false;
		            		System.out.println("===Goodbye!===");
			            	s.close();
		            		break;   
	          }
	       }
		}
	}
}
		

	        	