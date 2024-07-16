import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of address");
        int n = scanner.nextInt();
        scanner.nextLine();

        Map<String, List<Address>> cityAddressMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the address " + (i + 1) + " detail");
            String[] addressDetails = scanner.nextLine().split(",");
            Address address = new Address(addressDetails[0], addressDetails[1], addressDetails[2], addressDetails[3], Integer.parseInt(addressDetails[4]));

            if (cityAddressMap.containsKey(address.getCity())) {
                cityAddressMap.get(address.getCity()).add(address);
            } else {
                List<Address> addresses = new ArrayList<>();
                addresses.add(address);
                cityAddressMap.put(address.getCity(), addresses);
            }
        }

        System.out.println("Enter the city to be searched");
        String searchCity = scanner.nextLine();

        if (cityAddressMap.containsKey(searchCity)) {
            System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Line 1", "Line 2", "City", "State", "Pincode");
            for (Address address : cityAddressMap.get(searchCity)) {
                System.out.print(address);
            }
        } else {
            System.out.println("Searched city not found");
        }

        scanner.close();
    }
}
