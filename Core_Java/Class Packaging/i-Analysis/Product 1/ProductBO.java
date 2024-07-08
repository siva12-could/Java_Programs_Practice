

public class ProductBO {
	//public Product product;
	public static void main(String[] args) {
		
	}
	public void displayProductDetails(Product product) {
		System.out.println("Product Id is "+product.getId());
		System.out.println("Product Name is "+product.getProductName());
		System.out.println("Supplier Name is "+product.getSupplierName());
		System.out.println("Product price is "+product.getPrice());
	}
}
