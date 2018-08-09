package rostyslav.popadynets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rostyslav.popadynets.entity.Boock;

@Repository
public interface BoockRepository extends JpaRepository<Boock, Long>{

}
