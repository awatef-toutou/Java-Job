package com.awatef.library;

public class librarien {

    public librarien() { //constructor// we herit by the instance
        // they are in the same package
        Book b  = new Book();
        b.printbook();
        //public attribute
        b.title= "newbook";
        //protected attribute
        b.author ="franck";
        //default attributes & methods
        b.pages = 100; // they are by default & they herit by the instance
        b.countpages();//


    }
}
