import java.util.Scanner;

	public class Main{
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			String name,email;
			Customer c1=new Customer();
			Customer c2=new Customer();
			System.out.println("Enter First Customer Details :");
			System.out.println("Enter Customer Name:");
			name=input.nextLine();
			c1.setName(name);
			System.out.println("Enter Customer Email :");
			email=input.nextLine();
			c1.setEmail(email);
			System.out.println("Enter Second Customer Details:");
			System.out.println("Enter Customer Name:");
			name=input.nextLine();
			c2.setName(name);
			System.out.println("Enter Customer Email:");
			email=input.nextLine();
			c2.setEmail(email);
			
			if((c1.getEmail().equals(c2.getEmail()))) {
				System.out.println("The Email ids of "+c1.getName()+" and "+c2.getName()+" are equal");
			}
			else {
				System.out.println("The Email ids of "+c1.getName()+" and "+c2.getName()+" are not equal");
			}
			System.out.println("comparing with considering cases");
			if((c1.getEmail().equalsIgnoreCase(c2.getEmail()))) {
				System.out.println("The Email ids of "+c1.getName()+" and "+c2.getName()+" are equal");
			}
			else {
				System.out.println("The Email ids of "+c1.getName()+" and "+c2.getName()+" are not equal");
			}
		}
	}

