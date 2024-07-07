package com.oops.constructor;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String street;
        String city;
        int pincode;
        String country;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer Address");
        System.out.println("Enter the street");
        street = input.next();
        System.out.println("Enter the city");
        city = input.next();
        System.out.println("Enter the pincode");
        pincode = input.nextInt();
        System.out.println("Enter the country");
        country = input.next();

        Address a = new Address(street, city, pincode, country);
        a.displayAddress();
    }
}
