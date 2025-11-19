package com.exercicereportecard.ali;

public class Student {

    private String nom;
    private String prenom;
    private String classe;
    private String[][] tab;

    public Student(String nom, String prenom, String classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", classe='" + classe + '\'' +
                '}';
    }

    public void affiche() {
        System.out.println("the bulletin of " + nom + " " + prenom + " in the class " + classe);
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++)
                System.out.print(tab[j][i] + "   ");

            System.out.println();
        }
    }
}