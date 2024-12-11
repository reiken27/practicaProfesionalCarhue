package com.practica.profesional.practicaProfesionalCarhue.persistence;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practica.profesional.practicaProfesionalCarhue.model.Cart;
import com.practica.profesional.practicaProfesionalCarhue.model.Product;

@Repository
public interface CartDao extends JpaRepository<Cart,Integer> {

//	public Map<Product,Integer> findbyName(String productName);
//	public Cart findbyId(Integer cartId);
}