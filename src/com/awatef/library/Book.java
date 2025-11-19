package com.awatef.library;

public class Book {


     public String title;
     protected String author;
     private String isbn;
     int pages;


    public void printbook()
    {
        System.out.println("printing book...");
        System.out.println("the title is "+title);
        System.out.println("the author is "+author);
        System.out.println("the isbn is "+isbn);
        System.out.println("have "+pages+ " pages");
        //deletebook();// it s a prived methods but we can access because is in a public methods
    }

    protected void modifybook()
    {
        System.out.println("Modifying book ...");

    }
    private void deletebook()
    {
        System.out.println("deleting book...");
    }
    void  countpages()
    {
        System.out.println(+pages);
    }

}
