
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Long id;
		String productName;
		String supplierName;
		
		
		System.out.println("Enter the product id");
		id=Long.parseLong(input.nextLine());
		
		System.out.println("Enter the product name");
		productName=input.nextLine();
		
		System.out.println("Enter the supplier name");
		supplierName=input.nextLine();
		Product p=new Product(id,productName,supplierName);
		
		System.out.println(p);
		System.out.println("Invoking getClass() method:"+p.getClass());
		
		
	}
}
