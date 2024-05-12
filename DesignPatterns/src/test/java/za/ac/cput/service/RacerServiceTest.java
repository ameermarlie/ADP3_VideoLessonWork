package za.ac.cput.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Racer;
import za.ac.cput.factory.RacerFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class RacerServiceTest {
    @Autowired
    private RacerService service;
    private static Racer racer = RacerFactory.buildRacer("Mogamad","Ameer","Marlie",222124474);

    @Test
    void a_create(){
        Racer created=service.create(racer);
        assertNotNull(created);
        System.out.println(created);
    }
    @Test
    void b_read(){
        Racer read=service.read(racer.getName());
        assertNotNull(read);
        System.out.println(read);
    }
    @Test
    void c_update(){
        Racer newRacer=new Racer.Builder().copy(racer).setRacerNumber(9).build();
        Racer updated=service.update(newRacer);
        assertNotNull(updated);
        System.out.println(updated);
    }
    @Test
    @Disabled
    void e_delete(){
        service.delete(racer.getName());
        System.out.println("Success: deleted racer");
    }
    @Test
    void d_getAll(){
        System.out.println(service.getall());
    }

}