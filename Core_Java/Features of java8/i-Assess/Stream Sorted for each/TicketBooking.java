class TicketBooking{
    private String customerName;
    private Integer noOfTickets;
    private Double price;
    
    TicketBooking(String customerName, Integer noOfTickets, Double price){
        //Fill code here
        this.customerName=customerName;
        this.noOfTickets=noOfTickets;
        this.price=price;
    }
    String getCustomerName(){
        return this.customerName;
    }
    Integer getNoOfTickets(){
        return this.noOfTickets;
    }
    Double getPrice(){
        return this.price;
    }
    public String toString() {
        //Fill code here
        return String.format("%-10s %-15d %-15.1f\n",customerName,noOfTickets,price);
    } 
}
