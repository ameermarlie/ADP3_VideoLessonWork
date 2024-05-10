package za.ac.cput.domain;

//Composite Primary Key

import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeID implements Serializable {

    @Id
    private String firstName;
    @Id
    private String lastName;

    public EmployeeID() {}

    public EmployeeID(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeID that)) return false;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
