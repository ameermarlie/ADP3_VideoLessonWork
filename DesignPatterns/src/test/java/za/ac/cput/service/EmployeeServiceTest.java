package za.ac.cput.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.EmployeeID;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class   EmployeeServiceTest {
    @Autowired
    private EmployeeService employeeService;
    private static Employee employee1;
    private static Employee employee2;
    private static Employee employee3;
    private static Employee employee4;
    private static Employee employee5;

    @Test
    void a_setup(){
        employee1 = EmployeeFactory.buildEmployee("001", "Peter", "Parker");
        assertNotNull(employee1);
        System.out.println(employee1);
        employee2 = EmployeeFactory.buildEmployee("002", "Miguel", "Ohara");
        assertNotNull(employee2);
        System.out.println(employee2);
        employee3 = EmployeeFactory.buildEmployee("003", "Miles", "Morales");
        assertNotNull(employee3);
        System.out.println(employee3);
        employee4 = EmployeeFactory.buildEmployee("004", "Penny", "Parker");
        assertNotNull(employee4);
        System.out.println(employee4);
        employee5 = EmployeeFactory.buildEmployee("005", "Peter", "Porker");
        assertNotNull(employee5);
        System.out.println(employee5);

    }

    @Test
    void b_create() {
        Employee created1 = employeeService.create(employee1);
        assertNotNull(created1);
        System.out.println(created1);
        Employee created2 = employeeService.create(employee2);
        assertNotNull(created2);
        System.out.println(created2);
        Employee created3 = employeeService.create(employee3);
        assertNotNull(created3);
        System.out.println(created3);
        Employee created4 = employeeService.create(employee4);
        assertNotNull(created4);
        System.out.println(created4);
        Employee created5 = employeeService.create(employee5);
        assertNotNull(created5);
        System.out.println(created5);
    }

    @Test
    void c_read() {
        Employee read=employeeService.read(employee1.getEmployeeNumber());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void d_update() {
        Employee newEmployee = new Employee.Builder().copy(employee1).setEmployeeNumber("222124474").build();
        Employee updated = employeeService.update((newEmployee));
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void e_getall() {
        System.out.println(employeeService.getall());
    }
    @Test
    void f_delete(){
        employeeService.deleteById(employee1.getEmployeeNumber());
        System.out.println("Deleted successfully");
    }
}