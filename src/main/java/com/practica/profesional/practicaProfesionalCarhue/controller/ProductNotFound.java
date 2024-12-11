package com.practica.profesional.practicaProfesionalCarhue.controller;

public class ProductNotFound extends RuntimeException{

	public ProductNotFound() {
	}
	public ProductNotFound(String message) {
		super(message);
	}

}
