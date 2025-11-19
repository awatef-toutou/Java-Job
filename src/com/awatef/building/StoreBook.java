package com.awatef.building;

import com.awatef.library.Book;

public class StoreBook extends Book {

    public StoreBook() {
        title = "newbook";
        author = "franck"; //on a acces par qu on herite de la class book "extends
    }
   //   pages = 100; //they are by default
   //    countpages();//we can't acess when we are out of the package


}
