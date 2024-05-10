package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Contact{

    private String email;
    @Id
    private String mobile;

    protected Contact(){

    }
    public Contact(Builder builder){
        this.email = builder.email;
        this.mobile = builder.mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(getEmail(), contact.getEmail()) && Objects.equals(getMobile(), contact.getMobile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getMobile());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
    public static class Builder{
        private String email;
        private String mobile;

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder copy(Contact contact){
            this.email = contact.email;
            this.mobile = contact.mobile;
            return this;
        }
        public Contact build(){
            return new Contact(this);
        }
    }
}
