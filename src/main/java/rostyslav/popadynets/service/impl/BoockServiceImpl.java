package rostyslav.popadynets.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rostyslav.popadynets.entity.Boock;
import rostyslav.popadynets.repository.BoockRepository;
import rostyslav.popadynets.service.BoockService;

@Service
public class BoockServiceImpl implements BoockService {

	@Autowired
	private BoockRepository boockRepository;
	
	@Override
	public void addBoock(Boock boock) {
		boockRepository.save(boock);
	}

	@Override
	public List<Boock> loockAllBoocks() {
		return boockRepository.findAll();
	}

	@Override
	public Boock detalInfBoock(Long id) {
		return boockRepository.getOne(id);
	}

	@Override
	public void deleteBoock(Long id) {
		boockRepository.deleteById(id);
	}

}
