package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Pen;
import za.ac.cput.repository.PenRepository;

@Service
public class PenService {
    private PenRepository repository;

    @Autowired
    PenService(PenRepository repository) {this.repository=repository;}
    public Pen create(Pen pen) {
    return repository.save(pen); }
}