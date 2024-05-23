package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.MotoGPRacer;
import za.ac.cput.factory.MotoGPRacerFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MotoGPRacerServiceTest {
    @Autowired
    private MotoGPRacerService service;
    private MotoGPRacer racer= MotoGPRacerFactory.buildMotoGPRacer("Naruto","Namikaze","Uzumaki",21);

    @Test
    @Order(1)
    void create(){
        MotoGPRacer created=service.create(racer);
        assertNotNull(created);
        System.out.println(created);
    }
    @Test
    @Order(2)
    void read(){
        MotoGPRacer read=service.read(racer.getName());
        assertNotNull(read);
        System.out.println(read);
    }
    @Test
    @Order(3)
    void update(){
        MotoGPRacer newRacer=new MotoGPRacer.Builder().copy(racer).setRaceWins(racer.getRaceWins()+1).build();
        MotoGPRacer updated=service.update(newRacer);
        assertNotNull(updated);
        System.out.println(updated);
    }
    @Test
    @Order(4)
    void winsMoreThan(){
        System.out.println("Racer with number of wins more than 3:\n"+service.winsMoreThan(3));
    }

}