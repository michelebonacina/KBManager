package it.michelebonacina.kbmanager.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import it.michelebonacina.kbmanager.exceptions.NotFoundException;

@ControllerAdvice
public class ExceptionControllerAdvice {
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<String> handleException(NotFoundException exception) {
		String message = exception.getEntityName() + " with id " + exception.getId() + " not found!";
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	} // handleException

} // ExceptionControllerAdvice
