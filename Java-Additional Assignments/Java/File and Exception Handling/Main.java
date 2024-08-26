

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Replace the following string with the absolute path to input.txt on your system
        String filePath = "input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            ProductDAO productDAO = new ProductDAO();
            List<Product> productList = productDAO.obtainProductListFromFile(br);
            System.out.println("Product details");
            productDAO.displayProducts(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
