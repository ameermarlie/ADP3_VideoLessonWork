package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Book;
import za.ac.cput.domain.Pen;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PenServiceTest {
    @Autowired
    private PenService service;
    private Pen pen=new Pen(1234,"Bic Ballpoint","Black");

    @Test
    void create(){
        Pen created=service.create(pen);
        assertNotNull(created);
        System.out.println(created);
    }

}