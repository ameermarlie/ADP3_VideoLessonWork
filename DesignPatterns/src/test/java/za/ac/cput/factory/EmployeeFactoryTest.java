package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    void buildEmployee() {
        Employee e = EmployeeFactory.buildEmployee("222124474","Ameer","Marlie");
        assertNotNull(e);
        System.out.println(e.toString());
    }

    @Test
    void testBuildEmployeeWithFail() {
        Employee e = EmployeeFactory.buildEmployee("","Ameer","Marlie");
        assertNotNull(e);
        System.out.println(e.toString());
    }
}