package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Racer;

import static org.junit.jupiter.api.Assertions.*;

class RacerFactoryTest {
    @Test
    void testBuildRacerWithMiddleName(){
        Racer racer=RacerFactory.buildRacer("Mogamad","Ameer","Marlie",222124474);
        assertNotNull(racer);
        System.out.println(racer);
    }
    @Test
    void testBuildRacerWithoutMiddleName(){
        Racer racer= RacerFactory.buildRacer("Peter","Parker",222124475);
        assertNotNull(racer);
        System.out.println(racer);
    }
    @Test
    void testBuildRacerThatFails(){
        Racer racer=RacerFactory.buildRacer("Miguel","","Ohara",222124476);
        assertNotNull(racer);
        System.out.println(racer);
    }

}