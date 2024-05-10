package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.EmployeeID;
import za.ac.cput.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{
    private EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository){
        this.repository = repository;
    }

    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee read(EmployeeID employeeID) {
        return repository.findById(employeeID).orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.save(employee);
    }


    @Override
    public List<Employee> getall() {
        return repository.findAll();
    }

    @Override
    public List<Employee> getbyname(String name) {
        return List.of();
    }

    @Override
    public Employee findByName(String firstName) {
        return null;
    }

}
