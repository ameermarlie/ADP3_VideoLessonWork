package za.ac.cput.service;

import za.ac.cput.domain.Employee;
import za.ac.cput.domain.EmployeeID;
import za.ac.cput.repository.EmployeeRepository;

import java.util.List;

public interface IEmployeeService extends IService<Employee, EmployeeID>{
    List<Employee> getall();
    List<Employee> getbyname(String name);

    Employee findByName(String firstName);
}
