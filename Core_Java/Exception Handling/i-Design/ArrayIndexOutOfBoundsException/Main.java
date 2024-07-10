import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of seats to be booked:");
        int n = input.nextInt();
        int[] arr = new int[100];

        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the seat number " + (i + 1) );
                int seatnumber = input.nextInt();
                
                arr[seatnumber - 1] = seatnumber;
            }
            System.out.println("The seats booked are:");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    System.out.println(arr[i]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
