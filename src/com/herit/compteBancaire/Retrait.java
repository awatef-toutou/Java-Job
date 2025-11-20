package com.herit.compteBancaire;

public class Retrait implements Transaction {



    public Compte compte;

    public Retrait(Compte compte) {
        this.compte = compte;
    }

    @Override
    public void effectuer(double montant) {
        compte.retrait(montant);
    }
}
