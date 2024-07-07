import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		//fill your code here
		String accName,accNo,bankName;
		Scanner input=new Scanner(System.in);
		System.out.println("Choose Account Type\n 1.Savings Account \n 2.Current Account");
		int n=input.nextInt();
		
		if(n==1) {
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name");
			String[] ar=input.next().split(",");
			SavingsAccount a=new SavingsAccount(ar[0],ar[1],ar[2],ar[3]);
			a.display();
		}
		else if(n==2) {
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name");
			String[] ar=input.next().split(",");
			CurrentAccount c=new CurrentAccount(ar[0],ar[1],ar[2],ar[3]);
			c.display();
		}
	}
}
