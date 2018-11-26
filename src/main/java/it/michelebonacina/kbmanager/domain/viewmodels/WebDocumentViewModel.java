package it.michelebonacina.kbmanager.domain.viewmodels;

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
public class WebDocumentViewModel extends TopicViewModel {

	String url;

	public WebDocumentViewModel(String title, String description, TopicTypeViewModel type, Set<TagViewModel> tags, String url) {
		super(title, description, type, tags);
		this.url = url;
	}

}
