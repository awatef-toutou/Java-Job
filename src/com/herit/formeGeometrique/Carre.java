package com.herit.formeGeometrique;

public class Carre extends Forme {
    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    @Override
    public void aire() {
        double aireC = cote * cote;
        System.out.println("et d une aire :"+aireC);

    }

    @Override
    public void description() {
        System.out.println("Je suis un carré de côté " + cote + ".");
    }
}