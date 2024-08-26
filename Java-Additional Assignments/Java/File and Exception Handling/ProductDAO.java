
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductDAO {

    public List<Product> obtainProductListFromFile(BufferedReader br) throws IOException {
        List<Product> productList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] details = line.split(",");
            if (details.length == 6) {
                String productName = details[0];
                String brand = details[1];
                String color = details[2];
                Integer price = Integer.parseInt(details[3]);
                String ownerName = details[4];
                String ownerEmail = details[5];
                try {
                    if (!verifyEmail(ownerEmail)) {
                        throw new InvalidEmailException("InvalidEmailException:  Email Id invalid " + ownerEmail);
                    }
                    Product product = new Product(productName, brand, color, price, ownerName, ownerEmail);
                    productList.add(product);
                } catch (InvalidEmailException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return productList;
    }

    public void displayProducts(List<Product> productList) {
        System.out.printf("%-15s %-10s %-10s %-10s %-15s %-15s\n", "ProductName", "Brand", "Color", "Price", "OwnerName", "OwnerEmail");
        for (Product product : productList) {
            System.out.printf("%-15s %-10s %-10s %-10d %-15s %-15s\n",
                    product.getProductName(), product.getBrand(), product.getColor(), product.getPrice(), product.getOwnerName(), product.getOwnerEmail());
        }
    }

    public boolean verifyEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
