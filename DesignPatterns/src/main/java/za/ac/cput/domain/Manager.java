package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Manager extends BaseEmployee{
    private String parkingBay;
    protected Manager(){

    }
    private Manager(Builder builder){
        this.employeeNumber=builder.employeeNumber;
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.parkingBay=builder.parkingBay;
    }
    public String getParkingBay() {return parkingBay;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager manager)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getParkingBay(), manager.getParkingBay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getParkingBay());
    }

    @Override
    public String toString() {
        return "Manager{" +
                "parkingBay='" + parkingBay + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    public static class Builder{
        private String employeeNumber;
        private String firstName;
        private String lastName;
        private String parkingBay;

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

        public Builder setParkingBay(String parkingBay) {
            this.parkingBay = parkingBay;
            return this;
        }
        public Builder copy(Manager manager){
            this.employeeNumber = manager.employeeNumber;
            this.firstName = manager.firstName;
            this.lastName = manager.lastName;
            this.parkingBay = manager.parkingBay;
            return this;
        }
        public Manager build(){return new Manager(this);}
    }
}
