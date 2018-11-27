package it.michelebonacina.kbmanager.viewmodels;

import java.util.Set;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Article topic type.
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ArticleViewModel extends TopicViewModel {

	Integer page;

	MagazineViewModel magazine;

	public ArticleViewModel(String title, String description, Set<TagViewModel> tags, Integer page, MagazineViewModel magazine) {
		super(title, description, TopicTypeViewModel.ARTICLE, tags);
		this.page = page;
		this.magazine = magazine;
	}

}
