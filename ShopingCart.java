import java.util.*;

// Enum for product categories
enum Category {
    ELECTRONICS, CLOTHING, GROCERY;
}

// Product class
class Product {
    private int id;
    private String name;
    private double price;
    private Category category;

    public Product(int id, String name, double price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public Category getCategory() { return category; }

    @Override
    public String toString() {
        return id + ". " + name + " (" + category + ") - $" + price;
    }
}

// Shopping Cart class
class Cart {
    private List<Product> items = new ArrayList<>();
    
    public void addProduct(Product product) {
        items.add(product);
        System.out.println("Added: " + product.getName());
    }
    
    public void removeProduct(int productId) {
        items.removeIf(product -> product.getId() == productId);
        System.out.println("Removed product with ID: " + productId);
    }
    
    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Items in cart:");
        for (Product p : items) {
            System.out.println(p);
        }
    }
    
    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty. Please add items before checkout.");
            return;
        }
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        double discount = total > 100 ? total * 0.1 : 0; // 10% discount for total > $100
        double finalAmount = total - discount;
        System.out.println("Total: $" + total + " Discount: $" + discount + " Final Amount: $" + finalAmount);
        System.out.println("Thank you for shopping!");
        items.clear();
    }
}

// Main application
public class ShopingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Laptop", 750.00, Category.ELECTRONICS),
            new Product(2, "T-Shirt", 20.00, Category.CLOTHING),
            new Product(3, "Apples", 5.00, Category.GROCERY)
        ));

        while (true) {
            System.out.println("\n1. View Products\n2. Add to Cart\n3. Remove from Cart\n4. View Cart\n5. Checkout\n6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    break;
                case 2:
                    System.out.print("Enter product ID to add: ");
                    int addId = scanner.nextInt();
                    products.stream().filter(p -> p.getId() == addId).findFirst().ifPresent(cart::addProduct);
                    break;
                case 3:
                    System.out.print("Enter product ID to remove: ");
                    int removeId = scanner.nextInt();
                    cart.removeProduct(removeId);
                    break;
                case 4:
                    cart.viewCart();
                    break;
                case 5:
                    cart.checkout();
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
