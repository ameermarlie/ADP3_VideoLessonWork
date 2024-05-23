package za.ac.cput.service;

import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Customer;

import java.util.List;

public interface ICustomerService extends IService<Customer, String> {
    List<Customer> getAll();
}
