package it.michelebonacina.kbmanager.domain.models;

import java.util.Set;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Book topic type.
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Book extends Topic {

	Integer pages;

	public Book(String title, String description, Set<Tag> tags, Integer pages) {
		super(title, description, TopicType.BOOK, tags);
		this.pages = pages;
	}

}
