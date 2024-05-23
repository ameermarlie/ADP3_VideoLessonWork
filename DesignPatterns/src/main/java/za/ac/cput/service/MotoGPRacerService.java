package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.MotoGPRacer;
import za.ac.cput.domain.Name;
import za.ac.cput.repository.MotoGPRacerRepository;

import java.util.List;

@Service
public class MotoGPRacerService implements IService<MotoGPRacer, Name> {
    private MotoGPRacerRepository repository;

    @Autowired
    MotoGPRacerService(MotoGPRacerRepository repository) {
        this.repository=repository;
    }
    @Override
    public MotoGPRacer create(MotoGPRacer motoGPRacer) {
        return repository.save(motoGPRacer);
    }
    @Override
    public MotoGPRacer read(Name name){
      return repository.findById(name).orElse(null);
    }
    @Override
    public MotoGPRacer update(MotoGPRacer motoGPRacer) {
        return repository.save(motoGPRacer);
    }
    public List<MotoGPRacer> winsMoreThan(int number){return repository.findByRaceWinsGreaterThan(number);}
}
