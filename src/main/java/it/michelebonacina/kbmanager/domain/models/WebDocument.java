package it.michelebonacina.kbmanager.domain.models;

import java.util.Set;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Web document topic type.
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WebDocument extends Topic {

	String url;

	public WebDocument(String title, String description, TopicType type, Set<Tag> tags, String url) {
		super(title, description, type, tags);
		this.url = url;
	}

}
