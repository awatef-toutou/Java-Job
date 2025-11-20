package com.herit.compteBancaire;

public class Compte {
    public String name;
    public String lastname;
    public String numCompte;
    public double solde;


    public Compte(String name, String lastname,String numCompte,double solde){
        this.name = name;
        this.lastname = lastname;
        this.numCompte =numCompte;
        this.solde = solde;
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

    public void infos()
    {
        System.out.println("Information sur le compte n°"+numCompte);
        System.out.println("Titulaire : "+name+" "+lastname);
        System.out.println("Solde est: "+solde);
    }


}
