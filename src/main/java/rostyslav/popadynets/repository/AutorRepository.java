package rostyslav.popadynets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rostyslav.popadynets.entity.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

}
