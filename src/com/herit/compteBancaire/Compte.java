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
        this.solde =0;
    }

    public double getSolde() {
        return solde;
    }

    public void titulaire()
    {
        System.out.println("le compte du: "+name+" "+lastname);
    }


}
