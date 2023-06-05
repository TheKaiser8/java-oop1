package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        String name = "Notebook Acer";
        String description = "Notebook con processore di ultima generazione e 32 gb di RAM.";
        double VAT = 0.22; // IVA al 22%
        double price = 1099.99;
        Product product1 = new Product(name, description, VAT, price);

        // stampo output caratteristiche prodotto
        System.out.println("Il prodotto che hai definito presenta le seguenti caratteristiche: ");
        System.out.println("- Codice prodotto: " + product1.getNumberCode());
        System.out.println("- Nome: " + product1.getName());
        System.out.println("- Descrizione: " + product1.getDescription());
        System.out.println("- Prezzo (IVA esclusa): " + product1.getPrice() + "€"); // ottengo prezzo IVA esclusa tramite metodo gerPrice()
        System.out.println("- Prezzo totale comprensivo di IVA " + "(" + product1.getVAT() + "%): " + product1.getTotalPrice() + "€"); // // ottengo prezzo IVA inclusa tramite metodo gerTotalPrice()
        System.out.println("- Nome prodotto esteso (codice + nome): " + product1.getFullname());
    }
}
