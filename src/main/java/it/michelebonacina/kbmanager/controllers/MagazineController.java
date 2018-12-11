package it.michelebonacina.kbmanager.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/all")
	public ResponseEntity<List<MagazineViewModel>> listAllMagazines() {
		// search all magazines
		List<MagazineViewModel> magazineList = this.magazineService.getAllMagazines();
		// done
		return new ResponseEntity<List<MagazineViewModel>>(magazineList, HttpStatus.OK);
	} // listAllMagazines
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping	
	public ResponseEntity<MagazineViewModel> newMagazine(@RequestBody MagazineViewModel magazineViewModel) {
		// set new id
		magazineViewModel.setId(UUID.randomUUID().toString());
		// save magazine
		magazineViewModel = this.magazineService.createMagazine(magazineViewModel);
		// done
		return new ResponseEntity<MagazineViewModel>(magazineViewModel, HttpStatus.CREATED);
	} // newMagazine

} // MagazineCnontroller
