package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.ContactFactory;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CustomerServiceTest {
    @Autowired
    private CustomerService service;
    private Customer customer= CustomerFactory.buildCustomer("6969","Sasuke","Uchiha","sassybakka@gmail.com","0672703377","LinkedInProfile");
    @Test
    @Order(1)
    void create(){
        System.out.println(customer);
        Customer created=service.create(customer);
        assertNotNull(created);
        System.out.println(created);
    }
    @Test
    @Order(2)
    void read(){
        Customer read=service.read(customer.getCustomerId());
        assertNotNull(read);
        System.out.println(read);
    }
    @Test
    @Order(3)
    void update(){
        Contact editedContact=new Contact.Builder().copy(customer.getContact()).setMobile("08367845992").build();
        assertNotNull(editedContact);
        Customer editedCustomer=new Customer.Builder().copy(customer).setContact(editedContact).build();
        assertNotNull(editedCustomer);
        Customer updated=service.update(editedCustomer);
        assertNotNull(updated);
        System.out.println(updated);
    }
    @Test
    @Order(4)
    void getall(){
        System.out.println(service.getAll());}
}