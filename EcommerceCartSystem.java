import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product p = (Product) obj;
        return id == p.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " Rs." + price;
    }
}

class Cart {

    private List<Product> products = new ArrayList<>();

    // Add Product
    public void addProduct(Product p) {
        products.add(p);
    }

    // Calculate Total Price using Iterator
    public double calculateTotal() {
        double total = 0;

        Iterator<Product> itr = products.iterator();
        while (itr.hasNext()) {
            total += itr.next().price;
        }
        return total;
    }

    // Remove Duplicate Products
    public void removeDuplicates() {
        Set<Product> uniqueProducts = new LinkedHashSet<>(products);
        products.clear();
        products.addAll(uniqueProducts);
    }

    // Apply Discount
    public double applyDiscount(double percent) {
        double total = calculateTotal();
        return total - (total * percent / 100);
    }

    // Display Cart
    public void displayCart() {
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

public class EcommerceCartSystem {
    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addProduct(new Product(101, "Laptop", 50000));
        cart.addProduct(new Product(102, "Mouse", 1000));
        cart.addProduct(new Product(103, "Keyboard", 2000));
        cart.addProduct(new Product(102, "Mouse", 1000)); // Duplicate

        System.out.println("Cart Items:");
        cart.displayCart();

        System.out.println("\nTotal Price: Rs." +
                cart.calculateTotal());

        cart.removeDuplicates();

        System.out.println("\nAfter Removing Duplicates:");
        cart.displayCart();

        System.out.println("\nDiscounted Price (10%): Rs." +
                cart.applyDiscount(10));
    }
}