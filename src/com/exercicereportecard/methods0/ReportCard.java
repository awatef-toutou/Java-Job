package com.exercicereportecard.methods0;

public class ReportCard {


   private String nom;
   private String prenom;
   private String  classe;
   private String [][] tab ;/*= {{"9", "13", "19"},{"français", "anglais", "maths"},{"bien","continue","tres bien"}}*/;


    public ReportCard(String nom, String prenom, String classe , String[][] tab)  {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.tab = tab;
    }

    public void affiche() {
        System.out.println("the bulletin of " +nom+ " "+prenom+ " in the class "+classe);
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++)
                System.out.print(tab[j][i] + "   ");

            System.out.println();
        }
    }


}
