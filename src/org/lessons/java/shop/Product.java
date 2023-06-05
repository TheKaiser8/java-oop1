package org.lessons.java.shop;

public class Product {
    // CONSTANTS
    public final double VAT = 0.2;

    // FIELDS
    private int numberCode;
    private String name;
    private String description;
    private double price;

    // CONSTRUCTOR
    public Product(int numberCode, String name, String description, double price) {
        this.numberCode = numberCode;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // GETTERS & SETTERS
    // Getter per rendere accessibile in lettura il codice prodotto
    public int getNumberCode() {
        return this.numberCode;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for description
    public String getDescription() {
        return this.description;
    }
    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for price
    public double getPrice() {
        return this.price;
    }
    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // METHODS
}
