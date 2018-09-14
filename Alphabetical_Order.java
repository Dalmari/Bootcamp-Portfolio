
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.PriorityQueue;

public class Alphabetical_Order {

    public static void main(String[] args) throws Exception {
    	
    	final String FileName = "C:\\Users\\Dal\\Dropbox\\Dalmari Van der linde-15024\\Java files\\Task 20\\Input.txt"; //update for different files
        File file = new File(FileName);

        if (!file.isFile())
           throw new FileNotFoundException(file.getName() + " is not a file that could be located");

        PriorityQueue<String> pQueue = new PriorityQueue<>(100, String.CASE_INSENSITIVE_ORDER);

        try (BufferedReader in = new BufferedReader(new FileReader(file))) {

            String s;
            while ((s = in.readLine()) != null) {

                String[] words = getValidWords(s);
                for (String word : words) {
                    pQueue.add(word);
                }
            }
        } catch (FileNotFoundException e) {
           System.out.println("File Not Found");
        }

        while (pQueue.size() > 0) {
            System.out.println(pQueue.poll() );
        }
    }

    public static String[] getValidWords(String s) {
        s = s.replaceAll("[0-9]\\p{L}+", ""); // Words must start with a letter, ignore if not
           return s.split(" ");
    }
}
