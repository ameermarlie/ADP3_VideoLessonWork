package za.ac.cput.factory;

import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {
    public static Customer buildCustomer(String customerId, String firstName, String lastName,Contact contact){
        if(Helper.isNullOrEmpty(customerId)||Helper.isNullOrEmpty(firstName)||Helper.isNullOrEmpty(lastName)){
            return null;
        }
        if(!Helper.validateEmail(contact.getEmail())){
            return null;
        }
        return new Customer.Builder()
                .setCustomerId(customerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setContact(contact)
                .build();
    }
}
