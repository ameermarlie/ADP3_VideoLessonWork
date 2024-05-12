package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.mock.http.server.reactive.MockServerHttpRequest;

import java.util.Objects;

@Entity
public class SalesPerson extends BaseEmployee{

    private String salesId;
    private double commission;

    protected SalesPerson() {}

    public SalesPerson(Builder builder){
        this.employeeNumber=builder.employeeNumber;
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.salary=builder.salary;
        this.salesId=builder.salesId;
        this.commission=builder.commission;

    }
    public String getSalesId() {
        return salesId;
    }
    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }
    public double getCommission() {
        return commission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalesPerson that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(getCommission(), that.getCommission()) == 0 && Objects.equals(getSalesId(), that.getSalesId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSalesId(), getCommission());
    }
    @Override
    public String toString() {
        return "SalesPerson{" +
                "salesId='" + salesId + '\'' +
                ", commission=" + commission +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }


    public static class Builder{

        private String employeeNumber;

        private String firstName;

        private String lastName;

        private double salary;

        private String salesId;

        private double commission;

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

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder setSalesId(String salesId) {
            this.salesId = salesId;
            return this;
        }

        public Builder setCommission(double commission) {
            this.commission = commission;
            return this;
        }
        public Builder copy(SalesPerson salesPerson){
            this.employeeNumber=salesPerson.employeeNumber;
            this.firstName=salesPerson.firstName;
            this.lastName=salesPerson.lastName;
            this.salary=salesPerson.salary;
            this.salesId=salesPerson.salesId;
            this.commission=salesPerson.commission;

            return this;
        }
        public SalesPerson build(){return new SalesPerson(this);}
    }


}
