package com.herit.formeGeometrique;
public class Rectangle extends Forme {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void aire() {
       double air = largeur * hauteur;
        System.out.println("et d une aire "+air);

    }

    @Override
    public void description() {
        System.out.println("Je suis un rectangle de " + largeur + " x " + hauteur + ".");
    }
}
