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

	public Document(String title, String description, TopicType type, Set<Tag> tags) {
		super(title, description, type, tags);
	}

}
