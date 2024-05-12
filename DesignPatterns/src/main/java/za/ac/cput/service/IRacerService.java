package za.ac.cput.service;

import za.ac.cput.domain.Name;
import za.ac.cput.domain.Racer;

import java.util.Set;

public interface IRacerService extends IService<Racer, Name>{
    void delete(Name name);
    Set<Racer> getall();//get all returns a set of racers
}
