package it.michelebonacina.kbmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.michelebonacina.kbmanager.converters.MagazineConverter;
import it.michelebonacina.kbmanager.models.Magazine;
import it.michelebonacina.kbmanager.repositories.MagazineRepository;
import it.michelebonacina.kbmanager.viewmodels.MagazineViewModel;

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

	@Autowired
	MagazineConverter magazineConverter;

	public List<MagazineViewModel> getAllMagazines() {
		List<MagazineViewModel> magazines = null;
		// get magazines from repository
		List<Magazine> magazineList = this.magazineRepository.findAll();
		// converts magazine for user interface
		magazines = magazineConverter.toViewModelList(magazineList);
		// done
		return magazines;
	}
}
