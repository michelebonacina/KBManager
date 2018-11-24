package it.michelebonacina.kbmanager.domain.models;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * Main topic. Topic contains the common data for all type of information that
 * can be managed. All specialized type of information must extends this class.
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 */
@Data
@AllArgsConstructor
public abstract class Topic {

	String title;

	String description;

	@Getter
	TopicType type;

	Set<Tag> tags = new HashSet<Tag>();

}
