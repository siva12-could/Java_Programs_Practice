import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of bookings");
		int n=input.nextInt();
		input.nextLine();
		List<TicketBooking> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter customer name");
			String name=input.nextLine();
			
			System.out.println("Enter number of tickets");
			Integer noOfTickets=Integer.parseInt(input.nextLine());
			System.out.println("Enter the price");
			Double price=Double.parseDouble(input.nextLine());
			TicketBooking tb=new TicketBooking(name,noOfTickets,price);
			list.add(tb);
		}
		
		Collections.sort(list,new Comparator<TicketBooking>() {
			public int compare(TicketBooking tb1,TicketBooking tb2) {
				return Double.compare(tb1.getPrice(),tb2.getPrice());
			}
		});
		
		System.out.format("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
		for(TicketBooking t:list) {
			System.out.println(t);
		}
	}
}
