package com.awatef.building;

import com.awatef.library.Book;

public class House {
    public House() {
        Book bb = new Book();
        bb.printbook();
        //public attributes
        bb.title ="newbook";
        //protected attributes
        // bb.author = "franck";//on ne peut pas acceder à un element protegé
        //bb.modifybook(); //on ne peut pas acceder à un element protegé


    }
}
