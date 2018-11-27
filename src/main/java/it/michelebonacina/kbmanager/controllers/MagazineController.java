package it.michelebonacina.kbmanager.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/all")
	public List<MagazineViewModel> findAll() {
		List<MagazineViewModel> magazineList = new ArrayList<MagazineViewModel>();
		magazineList.add(new MagazineViewModel("IoProgrammo", 2018, 2, 223, "Edizioni Master", 74));
		magazineList.add(new MagazineViewModel("IoProgrammo", 2018, 1, 222, "Edizioni Master", 74));
		return magazineList;
	}

}
