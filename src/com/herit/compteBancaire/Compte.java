package com.herit.compteBancaire;

public class Compte {
     public int numCompte = (int)(Math.random()*100);
     public double solde = 0;


    @Override
    public String toString() {
        return "Compte{" +
                "numCompte=" + numCompte +
                ", solde=" + solde +
                '}';
    }

    public double getSolde() {
        return solde;
    }

    public void retrait(double montant) {
        if(solde>=montant){
            solde -= montant;
        System.out.println("votre nouveau solde :" +solde);
        }
        else{
            System.out.println("votre solde est insufisant !!!");
        }
    }

    public void depot(double montant) {

        solde +=montant;

        System.out.println("votre nouveau solde :"+solde);
    }


}
