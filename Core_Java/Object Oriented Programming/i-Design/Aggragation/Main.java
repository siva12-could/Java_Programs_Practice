import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the staff:");
        String staffName = sc.nextLine(); // Use nextLine() to capture the full name
        System.out.println("Enter the staff designation:");
        String designation = sc.nextLine(); // Use nextLine() to capture the full designation
        System.out.println("Enter the department name:");
        String department = sc.nextLine(); // Use nextLine() to capture the full department name

        Staff sstaff = new Staff(staffName, designation);
        Department d = new Department(department, sstaff); // Pass sstaff instead of staff
        d.display();
    }
}
