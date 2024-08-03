import java.io.*;

public class Main {  
    public static void main(String args[]) throws IOException {        
        System.out.println("Hotel Tariff Calculator");        
        System.out.println("1. Deluxe Room");
        System.out.println("2. Deluxe AC Room");
        System.out.println("3. Suite AC Room");
        System.out.println("Select Room Type:");
        HotelRoom room = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option = Integer.parseInt(br.readLine());

        switch (option) {
            case 1:
                System.out.println("Hotel Name:");
                String hotelName1 = br.readLine();
                System.out.println("Room Square Feet Area:");
                int numberOfSqFeet1 = Integer.parseInt(br.readLine());
                System.out.println("Room has TV (yes/no):");
                String hasTV = br.readLine();
                room = new DeluxeRoom(hotelName1, numberOfSqFeet1, hasTV);
                break;
                
            case 2:
                System.out.println("Hotel Name:");
                String hotelName2 = br.readLine();
                System.out.println("Room Square Feet Area:");
                int numberOfSqFeet2 = Integer.parseInt(br.readLine());
                System.out.println("Room has AC (yes/no):");
                String hasAC = br.readLine();
                room = new DeluxeACRoom(hotelName2, numberOfSqFeet2, hasAC);
                break;
                
            case 3:
                System.out.println("Hotel Name:");
                String hotelName3 = br.readLine();
                System.out.println("Room Square Feet Area:");
                int numberOfSqFeet3 = Integer.parseInt(br.readLine());
                System.out.println("Room has Wifi (yes/no):");
                String hasWifi = br.readLine();
                room = new SuiteACRoom(hotelName3, numberOfSqFeet3, hasWifi);
                break;
                
            default:
                System.out.println("Invalid Option");
                return;
        }

        if (room != null) {
            System.out.println("Room Tariff per day is: " + room.calculateTariff());
        }
    }
}
