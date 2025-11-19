package com.awatef.library;

public class CourseBook extends Book{

    public CourseBook() {
        author ="franck"; //protected attribut & in the same package
        printbook();
        title = " new"; //public attributs
        printbook();
        //private attributes
        //deletebook();// it s prived so we can't access outside the class
        //isbn = "1122323"
        pages = 100; //they are by default
        countpages();

    }





}
