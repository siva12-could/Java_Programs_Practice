import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Long phoneNumber;
		String name;
		String issuedDate;
		String dueDate;
		float amount;
		System.out.println("Enter Bill Details :");
		System.out.println("Enter Name :");
		name=input.nextLine();
		System.out.println("Enter Phone Number :");
		phoneNumber=Long.parseLong(input.nextLine());
		System.out.println("Enter Issued Date :");
		issuedDate=input.nextLine();
		System.out.println("Enter Due Date :");
		dueDate=input.nextLine();
		System.out.println("Enter Amount:");
		amount=Float.parseFloat(input.nextLine());
		BillInfo obj=new BillInfo(phoneNumber,name,issuedDate,dueDate,amount);
		System.out.println("Bill Details:");
		System.out.printf("%s %34s %23s %15s %15s\n","Customer Name","Phone Number","Issued Date","Due Date","Amount");
		System.out.println(obj);
	}
}
