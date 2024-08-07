import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter First Customer Details :");
		String name;
		String Email;
		System.out.println("Enter Customer Name :");
		name=input.nextLine();
		System.out.println("Enter Customer Email :");
		Email=input.nextLine();
		Customer c1=new Customer(name,Email);
		System.out.println("Enter Secon Customer Details :");
		System.out.println("Enter Customer Name :");
		name=input.nextLine();
		System.out.println("Enter Customer Email :");
		Email=input.nextLine();
		Customer c2=new Customer(name,Email);
		if(c1.getEmail().equals(c2.getEmail())) {
			System.out.println("The Email ids of "+c1.getEmail()+" and "+c2.getEmail()+" are equal");
		}
		else {
			System.out.println("The Email ids of "+c1.getEmail()+" and "+c2.getEmail()+" are not equal");
			System.out.println("Comparing without considering the cases :");
			if(c1.getEmail().equalsIgnoreCase(c2.getEmail())) {
				System.out.println("The Email ids of "+c1.getEmail()+" and "+c2.getEmail()+" are equal");
			}
		}

	}

}
