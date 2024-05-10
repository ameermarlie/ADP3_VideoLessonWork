package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Contact;

import static org.junit.jupiter.api.Assertions.*;

class ContactFactoryTest {
    @Test
    void buildContact(){
        Contact contact = ContactFactory.buildContact("username@domain.com","0672703377");
        assertNotNull(contact);
        System.out.println(contact.toString());
    }
    void buildContactwithFail(){
        Contact contact=ContactFactory.buildContact("ameermarlie","021");
        assertNull(contact);
        System.out.println(contact.toString());
    }

}