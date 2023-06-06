package org.lessons.java.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String name = scan.nextLine();
        Account account = new Account(name);

        scan.close();
    }
}
