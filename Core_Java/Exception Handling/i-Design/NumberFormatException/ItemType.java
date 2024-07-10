public class ItemType {
//Fill your code here	
	String name;
	Double deposit;
	Double costPerDay;
	public ItemType(String name, Double deposit, Double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	@Override
	public String toString() {
		return "Name:"+name+"\nDeposit:"+deposit+"\nCost Per Day"+costPerDay;
	}
	
}
