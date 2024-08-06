public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserBO userbo = UserBO.getList();
        
        System.out.println("Enter the number of User detail to be added");
        int n = input.nextInt();
        input.nextLine();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the user " + i + " detail in csv format");
            String[] arr = input.nextLine().split(",");
            User user = new User(arr[0].trim(), arr[1].trim(), arr[2].trim(), arr[3].trim());
            userbo.add(user);
        }
        
        System.out.println("Name                Contact Number      Username            Email               ");
        for (User user : userbo) {
            user.display();
        }
        
        System.out.println("Enter the range to be removed from array list");
        int fromIndex = input.nextInt();
        int toIndex = input.nextInt();
        
        userbo.removeUser(fromIndex, toIndex);
        
        System.out.println("Name                Contact Number      Username            Email               ");
        for (User user : userbo) {
            user.display();
        }
    }
}
