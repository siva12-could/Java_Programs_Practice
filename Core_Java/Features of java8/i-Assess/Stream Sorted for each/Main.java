import java.util.*; 
//Fill code here 

class Main
{
    public static void main(String args[]) {
        //Fill code here
        
        Scanner input=new Scanner(System.in);
        TreeMap<Double,List<TicketBooking>> tm=new TreeMap<>();
        List<Integer> pr=new ArrayList<>();
        System.out.println("Enter number of bookings");
        int n=input.nextInt();
        input.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter customer name");
            String name=input.nextLine();
            System.out.println("Enter number of tickets");
            Integer no_tickets=Integer.parseInt(input.nextLine());
            pr.add(no_tickets);
            System.out.println("Enter the price");
            double price=Double.parseDouble(input.nextLine());
            TicketBooking tb=new TicketBooking(name,no_tickets,price);
            tm.putIfAbsent(price,new ArrayList<>());
            tm.get(price).add(tb);

        }
        System.out.printf("%-10s %-15s %-15s\n","Customer","No Of Tickets","Price");
        for(Map.Entry<Double,List<TicketBooking>> entry:tm.entrySet()){
            for(TicketBooking tb:entry.getValue()){
                System.out.println(tb);
            }
        }
    }
}
