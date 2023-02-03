package models;

public class Product {
    String name;
    String brand;
    int price;
    int quantity;
    
    public Product() {
        this.name = "";
        this.brand = "";
        this.price = 0;
        this.quantity = 0;
    }
    
    public Product(String name, String brand, int price, int quantity) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }
    
    
}
