package rostyslav.popadynets.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rostyslav.popadynets.entity.Autor;
import rostyslav.popadynets.repository.AutorRepository;
import rostyslav.popadynets.service.AutorService;

@Service
public class AutorServiceImpl implements AutorService {

	@Autowired
	private AutorRepository autorRepository;
	
	@Override
	public void addAutor(Autor autor) {
		autorRepository.save(autor);
	}

	@Override
	public List<Autor> loockAllAutors() {
		return autorRepository.findAll();
	}

	@Override
	public Autor detalInfAutor(Long id) {
		return autorRepository.getOne(id);
	}

	@Override
	public void deleteAutor(Long id) {
		autorRepository.deleteById(id);
	}
	
}
