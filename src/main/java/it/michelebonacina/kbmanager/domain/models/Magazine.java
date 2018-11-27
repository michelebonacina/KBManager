package it.michelebonacina.kbmanager.domain.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Simple magazine.
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 */
@Data
@AllArgsConstructor
@Document(collection = "magazines")
@EqualsAndHashCode(callSuper = true)
public class Magazine extends BaseModel {

	private static final long serialVersionUID = -7890502977279791012L;

	String title;

	Integer year;

	Integer month;

	Integer number;

	String editor;

	Integer pages;

}
