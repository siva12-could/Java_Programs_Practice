import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		
		try{
			Long phoneNumber;
			String name;
			String issuedDate;
			String dueDate;
			float amount;
			Scanner input=new Scanner(System.in);
			BillInfo bi=new BillInfo();
			System.out.println("Enter Bill Details:");
			System.out.println("Enter Name:");
			name=input.nextLine();
			bi.setName(name);
			phoneNumber=Long.parseLong(input.nextLine());
			bi.setPhoneNumber(phoneNumber);
			System.out.println("enter Issued Date:");
			issuedDate=input.nextLine();
			bi.setIssueDate(issuedDate);
			System.out.println("Enter Due Date:");
			dueDate=input.nextLine();
			bi.setDueDate(dueDate);
			System.out.println("Enter Amount:");
			amount=Float.parseFloat(input.nextLine());
			bi.setAmount(amount);
			System.out.format("%-20s %-22s %-18s %-20s %-25s\n","Customer Name","Phone Number","Issued Date","Due Date","Amount");
			System.out.println(bi);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}
