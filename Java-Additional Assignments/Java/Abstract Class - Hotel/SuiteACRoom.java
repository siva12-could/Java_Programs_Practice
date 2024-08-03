
public class SuiteACRoom extends HotelRoom {
    private int ratePerSqFeet = 15;
    private String hasWifi;

    public SuiteACRoom(String hotelName, int numberOfSqFeet, String hasWifi) {
        super(hotelName, numberOfSqFeet);
        this.hasWifi = hasWifi;
    }

    @Override
    public int calculateTariff() {
        if (hasWifi.equalsIgnoreCase("yes")) {
            ratePerSqFeet += 2;
        }
        return numberOfSqFeet * ratePerSqFeet;
    }
}
