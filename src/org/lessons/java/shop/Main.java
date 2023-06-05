package org.lessons.java.shop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numberCode = randomNumberCode();
        String name = "Notebook Acer";
        String description = "Notebook con processore di ultima generazione e 32 gb di RAM.";
        double price = 1099.99;
        Product product1 = new Product(numberCode, name, description, price);

        System.out.println("Il prodotto che hai definito presenta le seguenti caratteristiche: ");
        System.out.println("- Codice prodotto: " + numberCode);
        System.out.println("- Nome: " + name);
        System.out.println("- Descrizione: " + description);
        System.out.println("- Prezzo: " + price);

    }

    // Metodo per ottenere codice prodotto (numero casuale tra 1000 e 10000)
    private static int randomNumberCode() {
        Random r = new Random();
        return r.nextInt(1000, 10000);
    }
}
