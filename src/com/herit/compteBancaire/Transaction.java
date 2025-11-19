package com.herit.compteBancaire;

public class Transaction extends Compte implements CompteInterface{
    public String pwd;
    public double amount;
    public double account;

    public Transaction(String name, String lastname, String pwd) {
        super(name, lastname, pwd);
    }

    @Override
    public void withdrawal(double amount, double account) {
        System.out.println("votre nouveau solde :" +(account -amount));
    }

    @Override
    public void withdrawal() {

    }

    @Override
    public void pay() {
        System.out.println("votre nouveau solde :"+(account+amount));
    }
}
