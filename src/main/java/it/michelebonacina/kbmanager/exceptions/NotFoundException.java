package it.michelebonacina.kbmanager.exceptions;

import lombok.Getter;

public class NotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -6693280831474706907L;
	
	@Getter
	private final String id;
	
	@Getter
	private final String entityName;
	
	public NotFoundException(String entityName, String id) {
		this.id = id;
		this.entityName = entityName;
	} // MagazineNotFoundException
	
} // MagazineNotFoundException
