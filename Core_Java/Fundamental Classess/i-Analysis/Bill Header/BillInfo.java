
public class BillInfo {
	Long phoneNumber;
	String name;
	String issuedDate;
	String dueDate;
	float amount;
	public BillInfo(Long phoneNumber, String name, String issuedDate, String dueDate, float amount) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.issuedDate = issuedDate;
		this.dueDate = dueDate;
		this.amount = amount;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String toString() {
		return String.format("%s %34s %23s %15s %15s\n",getName(),getPhoneNumber(),getIssuedDate(),getDueDate(),getAmount());
	}
	
}
