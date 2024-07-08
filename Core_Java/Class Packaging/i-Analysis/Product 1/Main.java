
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Product p=new Product();
		ProductBO pbo=new ProductBO();
		System.out.println("Enter the product id");
		long n=Long.parseLong(input.nextLine());
		p.setId(n);
		System.out.println("Enter the product name");
		String name=input.nextLine();
		p.setProductName(name);
		System.out.println("Enter the supplier name");
		String sname=input.nextLine();
		p.setSupplierName(sname);
		System.out.println("Enter the product price");
		Integer price=Integer.parseInt(input.nextLine());
		p.setPrice(price);
		pbo.displayProductDetails(p);
		
	}
}
