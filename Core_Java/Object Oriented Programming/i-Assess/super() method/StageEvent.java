public class StageEvent extends Event{
	Integer noOfSeats;
	StageEvent(String name,String detail,String type,String ownerName,Double costPerDay,Integer noOfSeats){
		super(name,detail,type,ownerName,costPerDay);
		this.noOfSeats=noOfSeats;
	}
}
