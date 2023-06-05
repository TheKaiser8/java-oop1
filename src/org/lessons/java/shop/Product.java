package org.lessons.java.shop;

import java.util.Random;

public class Product {
    // FIELDS
    private final int numberCode;
    private String name;
    private String description;
    private double VAT;
    private double price;

    // CONSTRUCTOR
    public Product(String name, String description, double VAT, double price) {
        this.numberCode = randomNumberCode();
        this.name = name;
        this.description = description;
        this.VAT = VAT;
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

    // Getter for VAT
    public double getVAT() {
        return this.VAT;
    }
    // Setter for VAT
    public void setVAT(double VAT) {
        this.VAT = VAT;
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
    // Metodo per ottenere codice prodotto (numero casuale tra 1000 e 10000)
    private int randomNumberCode() {
        Random r = new Random();
        return r.nextInt(1000, 10000);
    }
    public double getTotalPrice() {
        return this.price += this.price * VAT;
    }
}
