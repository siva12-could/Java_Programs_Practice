import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"))) {

            System.out.println("Enter the number of users:");
            int n = Integer.parseInt(sc.nextLine());

            ArrayList<User> userList = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                System.out.println("Enter the details of user :" + i);
                String[] userDetails = sc.nextLine().split(",");
                if (userDetails.length == 4) {
                    User user = new User(userDetails[0], userDetails[1], userDetails[2], userDetails[3]);
                    userList.add(user);
                } else {
                    System.out.println("Invalid input format. Please enter details in the format 'name,mobileNumber,username,password'");
                    i--; // Decrement i to re-enter details for the current user
                }
            }

            UserBO.writeFile(userList, bw);
            System.out.println("User details written to output.csv");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
