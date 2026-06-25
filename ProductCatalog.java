import java.util.HashMap;

class Product {
    String name;
    double price;
    String category;
    int quantity;

    Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Name: " + name +
                ", Price: " + price +
                ", Category: " + category +
                ", Quantity: " + quantity);
    }
}

public class ProductCatalog {
    public static void main(String[] args) {

        HashMap<Integer, Product> products = new HashMap<>();

        products.put(101, new Product("Laptop", 55000, "Electronics", 10));
        products.put(102, new Product("Mobile", 25000, "Electronics", 20));
        products.put(103, new Product("Headphones", 2000, "Accessories", 50));

        System.out.println("Product Catalog:");

        for (Integer id : products.keySet()) {
            System.out.print("Product ID: " + id + " -> ");
            products.get(id).display();
        }
    }
}