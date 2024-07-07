public class RTGSTransfer extends FundTransfer{
	//write your code here	
	private Double Rem;
	RTGSTransfer(String accountNumber,Double balance){
		super(accountNumber,balance);
	}
	public boolean transfer(Double transfer) {
		if(transfer>10000) {
			Rem=balance-transfer;
			return true;
		}
		else {
			return false;
		}
	}
	public Double getRem() {
		return Rem;
	}
}
