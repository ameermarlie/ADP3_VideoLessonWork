package za.ac.cput.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Manager;
import za.ac.cput.factory.ManagerFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ManagerServiceTest {
    @Autowired
    private ManagerService service;

    private Manager manager= ManagerFactory.buildManager("02","Joy","Boy","A1");

    @Test
    @Order(1)
    void create(){
        Manager created=service.create(manager);
        assertNotNull(created);
        System.out.println(created);
    }
    @Test
    @Order(2)
    void read(){
        Manager read=service.read("02");
        assertNotNull(read);
        System.out.println(read);
    }
    @Test
    @Order(3)
    void update(){
        Manager newManager=new Manager.Builder().copy(manager).setFirstName("Sun God").setLastName("Nika").build();
        Manager updated=service.update(newManager);
        assertNotNull(updated);
        System.out.println(updated);
    }
    @Test
    @Order(4)
    void getAll(){
        System.out.println(service.getAll());
    }
    @Test
    @Disabled
    @Order(5)
    void delete(){
        service.deleteById(manager.getEmployeeNumber());
        System.out.println("Sucessfully deleted Manager!");
    }
}