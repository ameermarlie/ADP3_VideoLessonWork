package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {


    @Test
    void buildCustomer(){
        Contact contact=ContactFactory.buildContact("ameermarlie@gmail.com","0672703377","LinkedInAmeer");
        assertNotNull(contact);
        Customer customer = CustomerFactory.buildCustomer("222124474","Ameer","Marlie",contact);
        assertNotNull(customer);
        System.out.println(customer.toString());
        }
        //build customer

    @Test
    void buildCustomerWithString(){

        Customer customer = CustomerFactory.buildCustomer("222124474","Ameer","Marlie","ameermarlie@gmail.com","0786754432","LinkedInAmeer");
        assertNotNull(customer);
        System.out.println(customer);
}

    }
