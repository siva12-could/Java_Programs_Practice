import java.util.*;

public class DeluxeRoom extends HotelRoom {
    private int ratePerSqFeet = 10;
    private String hasTV;

    public DeluxeRoom(String hotelName, int numberOfSqFeet, String hasTV) {
        super(hotelName, numberOfSqFeet);
        this.hasTV = hasTV;
    }

    @Override
    public int calculateTariff() {
        if (hasTV.equalsIgnoreCase("yes")) {
            ratePerSqFeet += 2;
        }
        return numberOfSqFeet * ratePerSqFeet;
    }
}
