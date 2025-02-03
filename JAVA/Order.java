

import java.util.List;

public class Order {
    private int orderId;
    private Customer customer1;
    private List<Product> products;
    private double totalAmount;

    public Order(int orderId, Customer customer, List<Product> products) {
        this.orderId = orderId;
        this.customer1 = customer;
        this.products = products;
        this.totalAmount = calculateTotalAmount();
    }

    private double calculateTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println(7*8);
        customer1.displayCustomerDetails();
        System.out.println("Ordered Products: ");
        for (Product product : products) {
            product.displayProductDetails();
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}
