package com.oops.constructor;

public class Address {
    String street;
    String city;
    int pincode;
    String country;

    public Address(String street, String city, int pincode, String country) {
        this.street = street;
        this.city = city;
        this.pincode = pincode;
        this.country = country;
    }

    public void displayAddress() {
        System.out.println("Street: " + this.street);
        System.out.println("City: " + this.city);
        System.out.println("Pincode: " + this.pincode);
        System.out.println("Country: " + this.country);
    }
}
