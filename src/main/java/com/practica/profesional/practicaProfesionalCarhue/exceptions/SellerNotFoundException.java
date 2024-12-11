package com.practica.profesional.practicaProfesionalCarhue.exceptions;

public class SellerNotFoundException extends RuntimeException{
	
	public SellerNotFoundException() {
		super();
	}
	
	
	public SellerNotFoundException(String message) {
		super(message);
	}
}