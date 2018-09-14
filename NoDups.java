import java.util.Arrays;
 
public class NoDups 
{   
    static void removeDuplicates(int[] arrayWithDups)
    {
        System.out.println("Original Array : ");
         
        for (int i = 0; i < arrayWithDups.length; i++)
        {
            System.out.print(arrayWithDups[i]+"\t");
        }
         
        //If all elements in input array were unique
         
        int noOfUniqueElements = arrayWithDups.length;
         
        //Now compare each element with all other elements
         
        for (int i = 0; i < noOfUniqueElements; i++) 
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {
                //If two elements are found equal
                 
                if(arrayWithDups[i] == arrayWithDups[j])
                {
                    //Replace duplicate element with last unique element
                     
                    arrayWithDups[j] = arrayWithDups[noOfUniqueElements-1];
                     
                    //minus one to size of unique element array length
                     
                    noOfUniqueElements--;
                     
                    //Similar for j
                     
                    j--;
                }
            }
        }
         
        //Copy only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
         
        int[] arrayWithoutDups = Arrays.copyOf(arrayWithDups, noOfUniqueElements);
         
        //Printing arrayWithoutDuplicates
         
        System.out.println();
         
        System.out.println("Array Without Duplicates : ");
         
        for (int i = 0; i < arrayWithoutDups.length; i++)
        {
            System.out.print(arrayWithoutDups[i]+"\t");
        }
         
        System.out.println();
              
    }
     
    public static void main(String[] args) 
    {        
         removeDuplicates(new int[] {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0});
         
       }    
}