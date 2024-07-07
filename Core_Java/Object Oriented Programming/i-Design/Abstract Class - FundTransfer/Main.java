import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws Exception {
		//write your code here
		String accountNumber;
		Double balance;
		Double amount;
		Integer n;
		Double rem;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your account number:");
		accountNumber=br.readLine();
		System.out.println("Enter the balance of the account:");
		balance=Double.parseDouble(br.readLine());
		System.out.println("Enter the type of transfer to be made:\n1.NEFT\n2.IMPS\n3.RTGS");
		n=Integer.parseInt(br.readLine());
		if(n==1) {
			System.out.println("Enter the amount to be transferred:");
			amount=Double.parseDouble(br.readLine());
			NEFTTransfer neft=new NEFTTransfer(accountNumber,balance);
			if(neft.validate(amount)==true) {
				if(neft.transfer(amount)) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is "+neft.getRem());
				}
				else {
					System.out.println("Transfer could not be made");
				}
				
			}
			else {
				System.out.println("Account number or transfer amount seems to be wrong");
			}
		}
		else if(n==2) {
			System.out.println("Enter the amount to be transferred:");
			amount=Double.parseDouble(br.readLine());
			IMPSTransfer imp=new IMPSTransfer(accountNumber,balance);
			if(imp.validate(amount)==true) {
				if(imp.transfer(amount)) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is "+imp.getRemaining());
				}
				else {
					System.out.println("Transfer could not be made");
				}
			}
			else {
				System.out.println("Account number or transfer amount seems to be wrong");
			}
		}
		else if(n==3) {
			System.out.println("Enter the amount to be transferred:");
			amount=Double.parseDouble(br.readLine());
			RTGSTransfer rtg=new RTGSTransfer(accountNumber,balance);
			if(rtg.validate(amount)==true) {
				if(rtg.transfer(amount)) {
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is "+rtg.getRem());
				}
				else {
					System.out.println("Transfer could not be made");
				}
			}
			else {
				System.out.println("Account number or transfer amount seems to be wrong");
			}
		}
		
		
	}
}
