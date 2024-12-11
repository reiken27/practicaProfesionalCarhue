package com.practica.profesional.practicaProfesionalCarhue.service;

import java.util.List;

import com.practica.profesional.practicaProfesionalCarhue.controller.ProductNotFound;
import com.practica.profesional.practicaProfesionalCarhue.exception.CartItemNotFound;
import com.practica.profesional.practicaProfesionalCarhue.models.Cart;
import com.practica.profesional.practicaProfesionalCarhue.CartDTO;
import com.practica.profesional.practicaProfesionalCarhue.models.CartItem;

public interface CartService {
	
	public Cart addProductToCart(CartDTO cart, String token) throws CartItemNotFound;
	public Cart getCartProduct(String token);
	public Cart removeProductFromCart(CartDTO cartDto,String token) throws ProductNotFound;
//	public Cart changeQuantity(Product product,Customer customer,Integer quantity);
	
	public Cart clearCart(String token);
	
}
