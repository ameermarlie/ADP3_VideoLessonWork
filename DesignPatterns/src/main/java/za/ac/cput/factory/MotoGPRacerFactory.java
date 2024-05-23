package za.ac.cput.factory;

import za.ac.cput.domain.MotoGPRacer;
import za.ac.cput.domain.Name;
import za.ac.cput.util.Helper;

public class MotoGPRacerFactory {
    public static MotoGPRacer buildMotoGPRacer(String firstName, String lastName,int raceWins) {
        if(Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)|| raceWins<0){
            return null;
        }
        Name name=new Name(firstName,"",lastName);
        return new MotoGPRacer.Builder()
                .setName(name)
                .setRaceWins(raceWins)
                .build();
    }
    public static MotoGPRacer buildMotoGPRacer(String firstName, String lastName,String middleName,int raceWins) {
        if (Helper.isNullOrEmpty(firstName)
                || Helper.isNullOrEmpty(lastName)
                || Helper.isNullOrEmpty(middleName)
                || raceWins<0){
            return null;
        }
        Name name=new Name(firstName,middleName,lastName);
        return new MotoGPRacer.Builder().setName(name).setRaceWins(raceWins).build();
    }
}
