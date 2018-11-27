package it.michelebonacina.kbmanager.viewmodels;

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
public class DocumentViewModel extends TopicViewModel {

	DocumentFormatViewModel format;

	public DocumentViewModel(String title, String description, TopicTypeViewModel type, Set<TagViewModel> tags, DocumentFormatViewModel format) {
		super(title, description, type, tags);
		this.format = format;
	}

}
