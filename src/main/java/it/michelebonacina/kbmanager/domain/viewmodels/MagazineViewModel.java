package it.michelebonacina.kbmanager.domain.viewmodels;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Simple magazine.
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 *
 */
@Data
@AllArgsConstructor
public class MagazineViewModel {

	String title;

	Integer year;

	Integer month;

	Integer number;

	String editor;

	Integer pages;

}
