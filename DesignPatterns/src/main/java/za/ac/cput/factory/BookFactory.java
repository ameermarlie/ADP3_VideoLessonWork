package za.ac.cput.factory;

import za.ac.cput.domain.Book;
import za.ac.cput.domain.Pen;
import za.ac.cput.util.Helper;

public class BookFactory {
    public static Book buildBook(long productId, String name, String author){
        if(productId<=0){
            return null;
        }
        if(Helper.isNullOrEmpty(name)||Helper.isNullOrEmpty(author)){
            return null;
        }
        return new Book(productId,name,author);
    }
}
