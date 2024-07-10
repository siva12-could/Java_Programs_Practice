import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String name;
        String depositTemp = null;
        String costTemp=null;
        Double deposit = null;
        Double costPerDay = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Item type details:\nEnter the name:");
        name = br.readLine();

        try {
            System.out.println("Enter the deposit:");
            depositTemp = br.readLine();
            deposit = Double.parseDouble(depositTemp);
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: For input string: "+depositTemp);
            return; // Stop the program
        }

        try {
            System.out.println("Enter the cost per day:");
            costTemp = br.readLine();
            costPerDay = Double.parseDouble(costTemp);
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: For input string: "+costTemp);
            return; // Stop the program
        }

        ItemType itemType = new ItemType(name, deposit, costPerDay);
        System.out.println("The details of the item type are:");
        System.out.println(itemType);
    }
}
