package it.michelebonacina.kbmanager.domain.models;

import java.util.Set;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Article topic type
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Article extends Topic {

	Integer page;

	Magazine magazine;

	public Article(String title, String description, Set<Tag> tags, Integer page, Magazine magazine) {
		super(title, description, TopicType.ARTICLE, tags);
		this.page = page;
		this.magazine = magazine;
	}

}
