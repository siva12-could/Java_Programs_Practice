public class IMPSTransfer extends FundTransfer{
	//write your code here	
	private Double Remaining;
	IMPSTransfer(String accountNumber,Double balance){
		super(accountNumber,balance);
	}
	public boolean transfer(Double transfer) {
		if(transfer+(0.02*transfer)<balance) {
			Remaining=balance-transfer-0.02*transfer;
			return true;
		}
		else {
			return false;
		}
	}
	public Double getRemaining() {
		return Remaining;
	}
}
