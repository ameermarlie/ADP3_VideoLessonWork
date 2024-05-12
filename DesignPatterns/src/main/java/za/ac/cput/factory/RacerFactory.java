package za.ac.cput.factory;

import za.ac.cput.domain.Name;
import za.ac.cput.domain.Racer;
import za.ac.cput.util.Helper;

public class RacerFactory {
    public static Racer buildRacer(String firstName,String lastName,int racerNumber){
        if(Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)||racerNumber<=0){
            return null;
        }
        Name name = new Name(firstName,"",lastName);

        return new Racer.Builder().setName(name)
                .setRacerNumber(racerNumber)
                .build();
    }
    public static Racer buildRacer(String firstName,String middleName,String lastName,int racerNumber){
        if(Helper.isNullOrEmpty(firstName) ||
                Helper.isNullOrEmpty(middleName)||
                Helper.isNullOrEmpty(lastName)||
                racerNumber<=0){
            return null;
        }
        Name name = new Name(firstName,middleName,lastName);

        return new Racer.Builder().setName(name)
                .setRacerNumber(racerNumber)
                .build();
    }
}
