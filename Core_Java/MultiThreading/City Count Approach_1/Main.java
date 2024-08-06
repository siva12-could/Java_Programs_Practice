import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of users:");
        int numUsers = scanner.nextInt();
        scanner.nextLine(); 

        
        ArrayList<User> users = new ArrayList<>();

        
        for (int i = 1; i <= numUsers; i++) {
            System.out.println("Enter the details of user " + i);
            String userDetails = scanner.nextLine();
            String[] userDetailsArray = userDetails.split(",");
            if (userDetailsArray.length == 4) {
                users.add(new User(userDetailsArray[0], userDetailsArray[1], userDetailsArray[2], userDetailsArray[3]));
            } else {
                System.out.println("Invalid input format. Please enter in the format: name,mobileNumber,city,state");
                i--; 
            }
        }

        
        System.out.println("Enter the number of cities:");
        int numCities = scanner.nextInt();
        scanner.nextLine(); 

        
        ArrayList<CityCount> cityCounts = new ArrayList<>();

        
        for (int i = 1; i <= numCities; i++) {
            System.out.println("Enter the name of city " + i);
            String cityName = scanner.nextLine();
            CityCount cityCount = new CityCount(cityName, users);
            cityCounts.add(cityCount);
        }

        
        for (CityCount cityCount : cityCounts) {
            cityCount.start();
        }

    
        for (CityCount cityCount : cityCounts) {
            try {
                cityCount.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
