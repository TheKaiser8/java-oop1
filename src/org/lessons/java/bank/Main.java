package org.lessons.java.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String name = scan.nextLine();
        Account account = new Account(name);

        boolean exit = false;
        do {
            System.out.println("Che operazione vuoi fare?");
            System.out.println("1-Versamento 2-Prelevamento 3-Esci");
            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    // Versamento
                    System.out.print("Versamento");
                    System.out.print("Cifra: ");
                    double depositAmount = scan.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Il tuo saldo: " + account.getBalance());
                    break;
                case "2":
                    // Prelevamento
                    System.out.println("Prelevamento");
                    System.out.print("Cifra: ");
                    double withdrawAmount = scan.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Il tuo saldo: " + account.getBalance());
                    break;
                case "3":
                    // Uscita
                    System.out.println("Arrivederci!");
                    exit = true;
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        } while (!exit);

        scan.close();
    }
}
