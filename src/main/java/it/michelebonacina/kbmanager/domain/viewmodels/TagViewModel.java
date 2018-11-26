package it.michelebonacina.kbmanager.domain.viewmodels;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Topic classification tag. Each topic could be associated to one or more
 * classification tag.
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 */
@Data
@AllArgsConstructor
public class TagViewModel {

	String value;

}
