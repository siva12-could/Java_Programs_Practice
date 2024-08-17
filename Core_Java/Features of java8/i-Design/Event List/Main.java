import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of events");
        //Fill your code here
        int n=scanner.nextInt();
        scanner.nextLine();
        List<Event> eventList=new ArrayList<>();
        System.out.println("Enter event details in CSV(Event Name,Organiser Name,Event Cost)");
        for(int i=0;i<n;i++) {
        	String[] arr=scanner.nextLine().split(",");
            Event obj1=new Event(arr[0],arr[1],Double.parseDouble(arr[2]));
            
            eventList.add(obj1);
        }
        Event o=new Event();
        o.display(eventList);
        
        
    }
}   
