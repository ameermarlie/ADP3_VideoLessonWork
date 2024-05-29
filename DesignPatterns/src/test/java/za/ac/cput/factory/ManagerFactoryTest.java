package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Manager;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFactoryTest {
    @Test
    void testBuildManager(){
        Manager manager=ManagerFactory.buildManager("01","Kruben","Naidoo","A1");
        assertNotNull(manager);
        System.out.println(manager);

    }

}