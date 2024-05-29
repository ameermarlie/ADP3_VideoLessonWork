package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Book;
import za.ac.cput.factory.BookFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookServiceTest {
    @Autowired
    private BookService service;
    private Book book=new Book(222124474,"Harry Potter","JK Simons");

    @Test
    void create(){
        Book created=service.create(book);
        assertNotNull(created);
        System.out.println(created);
    }

}