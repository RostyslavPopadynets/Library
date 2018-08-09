package rostyslav.popadynets.service;

import java.util.List;

import rostyslav.popadynets.entity.Autor;

public interface AutorService {

	void addAutor(Autor autor);
	
	List<Autor> loockAllAutors();
	
	Autor detalInfAutor(Long id);
	
	void deleteAutor(Long id);

}
