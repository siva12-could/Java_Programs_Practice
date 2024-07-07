public abstract class FundTransfer {
	//write your code here
	private String accountNumber;
	protected Double balance;
	public  abstract boolean transfer(Double transfer);
	public FundTransfer(String accountNumber, Double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public boolean validate(Double transfer) {
		if(accountNumber.length()==10 && transfer>0 && transfer<balance) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
