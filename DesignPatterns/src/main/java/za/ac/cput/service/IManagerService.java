package za.ac.cput.service;

import za.ac.cput.domain.Manager;

import java.util.List;
import java.util.Set;

public interface IManagerService extends IService<Manager,String>{
    Set<Manager> getAll();
    void deleteById(String id);
}
