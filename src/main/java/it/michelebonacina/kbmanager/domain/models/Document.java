package it.michelebonacina.kbmanager.domain.models;

import java.util.Set;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Document topic type.
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Document extends Topic {

	DocumentFormat format;

	public Document(String title, String description, TopicType type, Set<Tag> tags, DocumentFormat format) {
		super(title, description, type, tags);
		this.format = format;
	}

}
