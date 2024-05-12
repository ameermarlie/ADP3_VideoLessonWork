package za.ac.cput.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Racer {
    @EmbeddedId
    private Name name;
    private int racerNumber;

    protected Racer() { }
    private Racer(Builder builder) {
        this.name = builder.name;
        this.racerNumber = builder.racerNumber;
    }

    public Name getName() {
        return name;
    }

    public int getRacerNumber() {
        return racerNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Racer racer)) return false;
        return getRacerNumber() == racer.getRacerNumber() && Objects.equals(getName(), racer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRacerNumber());
    }
    @Override
    public String toString() {
        return "Racer{" +
                "name=" + name +
                ", racerNumber=" + racerNumber +
                '}';
    }

    public static class Builder {
        private Name name;
        private int racerNumber;

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder setRacerNumber(int racerNumber) {
            this.racerNumber = racerNumber;
            return this;
        }
        public Builder copy(Racer racer) {
            this.racerNumber = racer.racerNumber;
            this.name = racer.name;
            return this;
        }
        public Racer build() {
            return new Racer(this);
        }
    }
}
