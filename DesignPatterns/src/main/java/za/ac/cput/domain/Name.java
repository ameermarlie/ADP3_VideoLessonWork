package za.ac.cput.domain;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Name implements Serializable {
    private String firstName;
    private String middleName;
    private String lastName;

    protected Name() {}

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Name name)) return false;
        return Objects.equals(getFirstName(), name.getFirstName()) && Objects.equals(getMiddleName(), name.getMiddleName()) && Objects.equals(getLastName(), name.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getMiddleName(), getLastName());
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
