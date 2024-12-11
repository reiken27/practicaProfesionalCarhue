package com.practica.profesional.practicaProfesionalCarhue.service;

import com.practica.profesional.practicaProfesionalCarhue.models.CartDTO;
import com.practica.profesional.practicaProfesionalCarhue.models.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}
