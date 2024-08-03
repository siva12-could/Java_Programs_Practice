import java.util.*;
public class DeluxeACRoom extends HotelRoom {
    private int ratePerSqFeet = 12;
    private String hasAC;

    public DeluxeACRoom(String hotelName, int numberOfSqFeet, String hasAC) {
        super(hotelName, numberOfSqFeet);
        this.hasAC = hasAC;
    }

    @Override
    public int calculateTariff() {
        if (hasAC.equalsIgnoreCase("yes")) {
            ratePerSqFeet += 2;
        }
        return numberOfSqFeet * ratePerSqFeet;
    }
}
