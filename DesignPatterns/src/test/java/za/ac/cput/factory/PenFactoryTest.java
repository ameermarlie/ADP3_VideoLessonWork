package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Pen;

import static org.junit.jupiter.api.Assertions.*;

class PenFactoryTest {
    @Test
    void createPen(){
        Pen pen= new PenFactory().buildPen(2000,"Bick","black");
        assertNotNull(pen);
        System.out.println(pen);
    }

}