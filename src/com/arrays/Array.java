package com.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        //Array declaration



        //two dimensional  array declaration
        int[][] number2D = new int[3][5];

        //tree dimensional  array declaration
        int[][][] number3D = new int[3][5][7];

        // array with objects
        String [] names = new String[3];//declarer à vide
        String[] names1 = {"lea","tangui"};

        //Add a new element to the array
        //simple array declaration
        int[] numbers =new int[5];
        numbers[0]= 10;
        numbers[1]= 20;
        numbers[2]= 30;
        numbers[3]= 40;
        numbers[4]= 50;

        int[] newnumbers = Arrays.copyOf(numbers,10); // on copi l ancien tableau en lui
                                                                // donnant sa nouvelle taille
        newnumbers[newnumbers.length -1]=60;//on initilise le dernier element à 60

        //print array
        System.out.println(Arrays.toString(numbers));


        //convert a list array
        //list to convert
        ArrayList<Integer> list = new ArrayList<>(); // type de données// nom de la list//creation d une nouvelle list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //ArrayList converted to Object[] array
        Object[] objarray = list.toArray(); //on transforme ma list en un tableau
        System.out.println(Arrays.toString(objarray));

        //casting
        for (Object obj : objarray) {
            //using casting before addition
            System.out.print((Integer) obj +1+" "); //transtiper l objet en un entier pour pouvoir le manipuler comme un entier
            //ici just une addition de 1 à chaque object
        }


       int ranndomValue = list.get(new Random().nextInt(list.size()));



    }
}
