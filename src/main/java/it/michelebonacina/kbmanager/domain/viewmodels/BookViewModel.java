package it.michelebonacina.kbmanager.domain.viewmodels;

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
public class BookViewModel extends TopicViewModel {

	Integer pages;

	public BookViewModel(String title, String description, Set<TagViewModel> tags, Integer pages) {
		super(title, description, TopicTypeViewModel.BOOK, tags);
		this.pages = pages;
	}

}
