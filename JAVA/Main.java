import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Customer customer1 = new Customer("John Doe", "john.doe@example.com", "123 Elm Street");

        Product product1 = new Product("Laptop", 999.99, 10);
        Product product2 = new Product("Smartphone", 499.99, 50);
        Product product3 = new Product("Headphones", 89.99, 100);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);

        Order order = new Order(1001, customer1, productList);

        order.displayOrderDetails();
    }
}
