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
		// get magazines from repository
		List<Magazine> magazineList = this.magazineRepository.findAll();
		// converts magazine for user interface
		List<MagazineViewModel> magazines = this.magazineConverter.toViewModelList(magazineList);
		// done
		return magazines;
	} // getAllMagazines
	
	public MagazineViewModel createMagazine(MagazineViewModel magazineViewModel) {
		// get magazine from view model
		Magazine magazine = this.magazineConverter.toModel(magazineViewModel);
		// save magazine
		magazine = this.magazineRepository.save(magazine);
		// convert magazine for user interface
		magazineViewModel = this.magazineConverter.toViewModel(this.magazineRepository.save(magazine));
		// done
		return magazineViewModel;
	} // createMagazine
}
