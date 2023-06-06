package org.lessons.java.bank;

import java.util.Random;

public class Account {
    // FIELDS
    private int accountNumber;
    private String ownerName;
    private double balance;

    // CONSTRUCTOR
    public Account(String ownerName) {
        this.accountNumber = generateAccountNumber();
        this.ownerName = ownerName;
        this.balance = 0; // imposto il saldo = 0 alla creazione di un nuovo conto
    }

    // GETTERS & SETTERS
    // Numero conto accessibile SOLO in LETTURA
    public int getAccountNumber() {
        return accountNumber;
    }

    // Nome proprietario accessibile SIA in LETTURA che in SCRITTURA
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Saldo accessibile SOLO in LETTURA
    public double getBalance() {
        return balance;
    }

    // METHODS
    // Metodo per versare una somma di denaro
    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
        }
    }

    // Metodo per prelevare una somma di denaro
    public void withdraw(double amount) {
        if(this.balance > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    private int generateAccountNumber() {
        Random rand = new Random();
        return rand.nextInt(1000);
    }
}
