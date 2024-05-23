package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Customer;
import za.ac.cput.repository.ContactRepository;
import za.ac.cput.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    private ContactRepository contactRepository;
    private CustomerRepository customerRepository;

    @Autowired
    CustomerService(ContactRepository contactRepository, CustomerRepository customerRepository) {
        this.contactRepository = contactRepository;
        this.customerRepository = customerRepository;

    }
    @Override
    public Customer create(Customer customer) {
        contactRepository.save(customer.getContact());
        return customerRepository.save(customer);
    }
    @Override
    public Customer read(String customerId){
        return customerRepository.findById(customerId).orElse(null);
    }
    @Override
    public Customer update(Customer customer) {
        contactRepository.save(customer.getContact());
        return customerRepository.save(customer);
    }
    @Override
    public List<Customer> getAll() {return customerRepository.findAll();}

}
