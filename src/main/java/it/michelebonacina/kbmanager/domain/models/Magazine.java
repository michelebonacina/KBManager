package it.michelebonacina.kbmanager.domain.models;

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
public class Magazine {

	String title;

	Integer year;

	Integer month;

	Integer number;

	String editor;

	Integer pages;

}
