import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             FileWriter fr = new FileWriter("output.txt")) {

            EventBO eventBO = new EventBO();
            List<Event> eventList = eventBO.readFromFile(br);
            eventBO.writeFile(eventList, fr);
            System.out.println("Events written to output.txt");

        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }
}
