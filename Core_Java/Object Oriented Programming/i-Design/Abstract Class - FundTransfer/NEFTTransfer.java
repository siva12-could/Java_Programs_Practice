public class NEFTTransfer extends FundTransfer{
	private Double rem;
	public NEFTTransfer(String accountNumber, Double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	//write your code here
	public boolean transfer(Double transfer) {
		if(super.validate(transfer)==true) {
			if(transfer+(5/100*transfer)<balance){
				rem=balance-transfer-0.05*transfer;
				return true;
			}
			return false;
		}
		else {
			return false;
		}
		
	}
	public Double getRem() {
		return rem;
	}
}
