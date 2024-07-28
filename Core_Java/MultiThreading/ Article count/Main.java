
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of lines");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Article[] threads = new Article[n];

      
        for (int i = 0; i < n; i++) {
            System.out.println("Enter line " + (i + 1));
            String line = scanner.nextLine();
            threads[i] = new Article(line);
        }

       
        for (Article thread : threads) {
            thread.start();
        }

        int totalCount = 0;
        for (Article thread : threads) {
            try {
                thread.join();
                totalCount += thread.getCount();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("There are " + totalCount + " articles in the given input");

        scanner.close();
    }
}
