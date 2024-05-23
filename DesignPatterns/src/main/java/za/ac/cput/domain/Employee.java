package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

import java.util.Objects;

//-------------BUILDER EXAMPLE------------

@Entity
//@IdClass(EmployeeID.class)
//@Table(name="Employee")
public class Employee {
    @Id
    private String employeeNumber;

    private String firstName;

    private String lastName;


    public Employee(){}

    private Employee(Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getEmployeeNumber() {return employeeNumber;}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeNumber, employee.employeeNumber) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder{
        private String employeeNumber;
        private String firstName;
        private String lastName;

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Employee employee){
            this.employeeNumber = employee.employeeNumber;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
