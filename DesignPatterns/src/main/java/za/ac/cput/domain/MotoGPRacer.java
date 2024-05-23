package za.ac.cput.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class MotoGPRacer {
    @EmbeddedId
    private Name name;
    private int raceWins;

    protected MotoGPRacer() { }

    private MotoGPRacer(Builder builder){
        this.name=builder.name;
        this.raceWins=builder.raceWins;
    }

    public Name getName() {
        return name;
    }

    public int getRaceWins() {
        return raceWins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MotoGPRacer that)) return false;
        return getRaceWins() == that.getRaceWins() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRaceWins());
    }

    @Override
    public String toString() {
        return "MotoGPRacer{" +
                "name=" + name +
                ", raceWins=" + raceWins +
                '}';
    }
    public static class Builder {
        private Name name;
        private int raceWins;

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder setRaceWins(int raceWins) {
            this.raceWins = raceWins;
            return this;
        }
        public Builder copy(MotoGPRacer motoGPRacer){
            this.name=motoGPRacer.name;
            this.raceWins=motoGPRacer.raceWins;
            return this;
        }
        public MotoGPRacer build(){return new MotoGPRacer(this);}
    }
}
