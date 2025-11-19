package com.exercicereportecard.methods0;

public class Main {
    public static void main(String[] args) {
        Eleves e1 = new Eleves();
        ReportCard bull = new ReportCard("lea", "dupont", "alc", e1.eleV1);
        bull.affiche();
    }
}