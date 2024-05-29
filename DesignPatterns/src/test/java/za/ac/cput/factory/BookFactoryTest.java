package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Book;

import static org.junit.jupiter.api.Assertions.*;

class BookFactoryTest {
    @Test
    void createBook() {
        Book book=new BookFactory().buildBook(3000,"Harry Potter","JK Rowling");
        assertNotNull(book);
        System.out.println(book);
    }

}