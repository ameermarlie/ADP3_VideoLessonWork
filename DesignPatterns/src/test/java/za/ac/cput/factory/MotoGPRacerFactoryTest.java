package za.ac.cput.factory;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.MotoGPRacer;
import za.ac.cput.domain.Name;

import static org.junit.jupiter.api.Assertions.*;

class MotoGPRacerFactoryTest {
    @Test
    @Order(2)
    void buildMotoGPRacerWithoutMiddleName() {
        MotoGPRacer racer= MotoGPRacerFactory.buildMotoGPRacer("Ameer","Marlie",50);
        assertNotNull(racer);
        System.out.println(racer);
    }
    @Test
    @Order(1)
    void buildMotoGPRacerWithMiddleName() {
        MotoGPRacer racer=MotoGPRacerFactory.buildMotoGPRacer("Itachi","Marlie","Uchiha",69);
        assertNotNull(racer);
        System.out.println(racer);
    }

}