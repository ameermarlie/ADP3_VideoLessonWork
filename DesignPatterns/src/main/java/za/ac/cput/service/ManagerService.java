package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Manager;
import za.ac.cput.repository.ManagerRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ManagerService implements IManagerService {
    private ManagerRepository managerRepository;

    @Autowired
    ManagerService(ManagerRepository repository) {this.managerRepository = repository;}

    @Override
    public Manager create(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public Manager read(String employeeNumber) {
        return managerRepository.findById(employeeNumber).orElse(null);
    }

    @Override
    public Manager update(Manager manager) {
        return managerRepository.save(manager);
    }
    @Override
    public Set<Manager> getAll() {
        return managerRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public void deleteById(String id) {
        managerRepository.deleteById(id);
    }

}
