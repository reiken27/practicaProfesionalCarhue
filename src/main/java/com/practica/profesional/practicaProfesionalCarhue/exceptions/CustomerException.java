package com.practica.profesional.practicaProfesionalCarhue.exceptions;

public class CustomerException extends RuntimeException{
	public CustomerException() {
		super();
	}
	
	public CustomerException(String message) {
		super(message);
	}
}