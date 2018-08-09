package rostyslav.popadynets.service;

import java.util.List;

import rostyslav.popadynets.entity.Boock;

public interface BoockService {

	void addBoock(Boock boock);
	
	List<Boock> loockAllBoocks();
	
	Boock detalInfBoock(Long id);
	
	void deleteBoock(Long id);

}
