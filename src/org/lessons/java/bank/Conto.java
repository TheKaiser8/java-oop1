package org.lessons.java.bank;

public class Conto {
    // FIELDS
    private int numeroConto;
    private String nomeProprietario;
    private double saldo;

    // CONSTRUCTOR
    public Conto(int numeroConto, String nomeProprietario) {
        this.numeroConto = numeroConto;
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0; // imposto il saldo = 0 alla creazione di un nuovo conto
    }

    // GETTERS & SETTERS
    // Numero conto accessibile SOLO in LETTURA
    public int getNumeroConto() {
        return this.numeroConto;
    }

    // Nome proprietario accessibile SIA in LETTURA che in SCRITTURA
    public String getNomeProprietario() {
        return this.nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    // Saldo accessibile SOLO in LETTURA
    public double getSaldo() {
        return this.saldo;
    }

    // METHODS
}
