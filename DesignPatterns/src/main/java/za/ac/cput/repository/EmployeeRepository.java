package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.EmployeeID;

import java.util.ArrayList;
import java.util.List;

@Repository
//String was changed to EmployeeID in the parameters of the below public class
public interface EmployeeRepository extends JpaRepository<Employee, String> {
//    Employee findByFirstName(String firstName);
//    void deleteEmployeeByFirstName(String firstName);
//    void deleteEmployeesByLastName(String lastName);
//    void Delete(String id);
}
