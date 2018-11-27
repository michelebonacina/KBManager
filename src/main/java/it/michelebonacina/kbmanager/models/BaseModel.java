package it.michelebonacina.kbmanager.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.Data;

/**
 * Base class for persistence management
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 */
@Data
public abstract class BaseModel implements Serializable {

	private static final long serialVersionUID = -3304505853705657576L;

	@Id
	protected String id;

}
