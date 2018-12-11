package it.michelebonacina.kbmanager.viewmodels;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Simple magazine.
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 *
 */
@Data
@NoArgsConstructor
public class MagazineViewModel {
	
	String id;

	String title;

	Integer year;

	Integer month;

	Integer number;

	String editor;

	Integer pages;

}
