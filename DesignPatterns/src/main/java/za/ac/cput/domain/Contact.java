package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Contact{
    @Id
    private String email;
    private String mobile;
    private String linkedInProfile;


    protected Contact(){

    }
    public Contact(Builder builder){
        this.email = builder.email;
        this.mobile = builder.mobile;
        this.linkedInProfile=builder.linkedInProfile;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getLinkedInProfile() {
        return linkedInProfile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(getEmail(), contact.getEmail()) && Objects.equals(getMobile(), contact.getMobile()) && Objects.equals(getLinkedInProfile(), contact.getLinkedInProfile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getMobile(), getLinkedInProfile());
    }

    public static class Builder{
        private String email;
        private String mobile;
        private String linkedInProfile;

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setLinkedInProfile(String linkedInProfile) {
            this.linkedInProfile = linkedInProfile;
            return this;
        }
        public Builder copy(Contact contact){
            this.email = contact.email;
            this.mobile = contact.mobile;
            this.linkedInProfile = contact.linkedInProfile;
            return this;
        }
        public Contact build(){
            return new Contact(this);
        }
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", linkedInProfile='" + linkedInProfile + '\'' +
                '}';
    }
}
