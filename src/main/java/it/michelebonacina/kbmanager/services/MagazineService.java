package it.michelebonacina.kbmanager.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.michelebonacina.kbmanager.exceptions.NotFoundException;
import it.michelebonacina.kbmanager.models.Magazine;
import it.michelebonacina.kbmanager.repositories.MagazineRepository;

/**
 * Magazine management.
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 */
@Service
public class MagazineService {

	@Autowired
	MagazineRepository magazineRepository;

	public List<Magazine> getAllMagazines() {
		// get magazines from repository
		List<Magazine> magazines = this.magazineRepository.findAll();
		// done
		return magazines;
	} // getAllMagazines
	
	public Magazine createMagazine(Magazine magazine) {
		// set new id
		magazine.setId(UUID.randomUUID().toString());
		// save magazine
		magazine = this.magazineRepository.save(magazine);
		// done
		return magazine;
	} // createMagazine
	
	public Magazine updateMagazine(String id, Magazine magazine) {
		// check if magazine exist
		Optional<Magazine> persistentMagazine = this.magazineRepository.findById(id);
		if (persistentMagazine.isPresent()) {
			// save magazine
			magazine.setId(id);
			magazine = this.magazineRepository.save(magazine);
		} else {
			// magazine not found
			throw new NotFoundException("Magazine", id);
		}
		// done
		return magazine;
	} // updateMagazine

} // MagazineService
