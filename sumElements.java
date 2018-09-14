package sumElements;
import java.util.Locale;
import java.util.Scanner;
		public class sumElements {

		  public static void main(String[] args) {
			  Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		        int matrixRow = 3;
		        int matrixCol = 4;
		         
		        //defining 2D array to hold matrix data
		        double[][] matrix = new double[matrixRow][matrixCol];

		        // Enter Matrix Data
		        enterMatrixData(scan, matrix, matrixRow, matrixCol);
		        
		    //     Print Matrix Data
		    printMatrix(matrix, matrixRow, matrixCol);
		  }

		  public static void enterMatrixData(Scanner scan, double[][] matrix, int matrixRow, int matrixCol){
		     System.out.println("Enter Matrix Data");
		          
		          for (int i = 0; i < matrixRow; i++)
		          {
		              for (int j = 0; j < matrixCol; j++)
		              {
		                  matrix[i][j] = scan.nextDouble();
		              }
		          }
		  }
		  
		  public static void printMatrix(double[][] matrix, int matrixRow, int matrixCol){
		    System.out.println("Your Matrix is : ");
		        
		        for (int i = 0; i < matrixRow; i++)
		        {
		            for (int j = 0; j < matrixCol; j++)
		            {
		                System.out.print(matrix[i][j]+"\t");
		            }
		             
		            System.out.println();
		        }
		  double column1Total = 0, column2Total = 0, column3Total = 0, column4Total = 0;
		  
		  for (int i=0;i< matrix.length;i++) {
			  column1Total += matrix[i][0];
			  column2Total += matrix [i][1];
			  column3Total += matrix[i][2];
			  column4Total += matrix[i][3];
		  }
		  System.out.println("The first Column's total is: "+ column1Total);
		  System.out.println("The second Column's total is: "+ column2Total);
		  System.out.println("The third Column's total is: "+ column3Total);
		  System.out.println("The fourth Column's total is: "+ column4Total);
		  }
		  }