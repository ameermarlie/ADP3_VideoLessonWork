package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class BaseEmployee {
    @Id
    protected String employeeNumber;

    protected String firstName;

    protected String lastName;

    protected double salary;


    protected BaseEmployee(){}

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEmployee that)) return false;
        return Double.compare(getSalary(), that.getSalary()) == 0 && Objects.equals(getEmployeeNumber(), that.getEmployeeNumber()) && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeNumber(), getFirstName(), getLastName(), getSalary());
    }


    @Override
    public String toString() {
        return "BaseEmployee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
