package it.michelebonacina.kbmanager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.michelebonacina.kbmanager.converters.MagazineConverter;
import it.michelebonacina.kbmanager.models.Magazine;
import it.michelebonacina.kbmanager.services.MagazineService;
import it.michelebonacina.kbmanager.viewmodels.MagazineViewModel;

/**
 * Magazine REST Controller. This controller expose all REST methods for
 * magazine management. The base magazine URL is '/api/magazine' and all
 * specific methods append personal URL to it. Available RES
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 */
@RestController
@RequestMapping("/api/magazine")
public class MagazineController {

	@Autowired
	MagazineService magazineService;
	
	@Autowired
	MagazineConverter magazineConverter;

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/all")
	public ResponseEntity<List<MagazineViewModel>> listAllMagazines() {
		// search all magazines
		List<Magazine> magazines = this.magazineService.getAllMagazines();
		// converts magazine for user interface
		List<MagazineViewModel> magazineList = this.magazineConverter.toViewModelList(magazines);
		// done
		return ResponseEntity.status(HttpStatus.OK).body(magazineList);
	} // listAllMagazines
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping	
	public ResponseEntity<MagazineViewModel> newMagazine(@RequestBody MagazineViewModel magazineViewModel) {
		// get magazine from view model
		Magazine magazine = this.magazineConverter.toModel(magazineViewModel);
		// create a new magazine
		magazine = this.magazineService.createMagazine(magazine);
		// convert magazine for user interface
		magazineViewModel = this.magazineConverter.toViewModel(magazine);
		// done
		return ResponseEntity.status(HttpStatus.CREATED).body(magazineViewModel);
	} // newMagazine
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(value = "/{id}")	
	public ResponseEntity<MagazineViewModel> updateMagazine(@PathVariable("id") String id, @RequestBody MagazineViewModel magazineViewModel) {
		// get magazine from view model
		Magazine magazine = this.magazineConverter.toModel(magazineViewModel);
		// update existing magazine
		magazine = this.magazineService.updateMagazine(id, magazine);
		// convert magazine for user interface
		magazineViewModel = this.magazineConverter.toViewModel(magazine);
		// done
		return ResponseEntity.status(HttpStatus.OK).body(magazineViewModel);
	} // newMagazine

} // MagazineCnontroller
