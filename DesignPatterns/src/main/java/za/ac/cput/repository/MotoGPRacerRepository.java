package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.MotoGPRacer;
import za.ac.cput.domain.Name;

import javax.swing.*;
import java.util.List;

public interface MotoGPRacerRepository extends JpaRepository<MotoGPRacer, Name> {

    List<MotoGPRacer> findByRaceWinsGreaterThan(int wins);
}
