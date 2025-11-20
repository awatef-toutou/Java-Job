package com.herit.compteBancaire;

public class Main {
    public static void main(String[] args)
    {
        Compte c = new Compte("awatef", "dri", "D12", 124.5);

        Transaction add = new Dépot(c);
        add.effectuer(200);

        Transaction remove = new Retrait(c);
        remove.effectuer(500);

        CompteCourant cc = new CompteCourant("lea","dupon","S523",500);
        Transaction add1 = new Dépot(cc);

        add1.effectuer(130);
        cc.infos();

    }
}