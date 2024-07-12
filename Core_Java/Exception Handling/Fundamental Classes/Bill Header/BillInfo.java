
public class BillInfo {
	Long phoneNumber;
	String name;
	String issueDate;
	String dueDate;
	float amount;
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate=issueDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate=dueDate;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount=amount;
	}
	public String toString() {
		return String.format("%-20s %-22s %-18s %-20s %-25s\n",getName(),getPhoneNumber(),getIssueDate(),getDueDate(),getAmount());
	}
}
