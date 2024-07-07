public class Exhibition extends Event{
	//write	your code here
	Integer noOfStall;
	Exhibition(String name,String detail,String type,String ownerName,Double costPerDay,Integer noOfStall){
		super(name,detail,type,ownerName,costPerDay);
		this.noOfStall=noOfStall;
	}
}
