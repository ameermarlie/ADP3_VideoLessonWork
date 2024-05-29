package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Pen;

@Repository
public interface PenRepository extends JpaRepository<Pen, Long> {
}
