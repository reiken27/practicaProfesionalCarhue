package com.practica.profesional.practicaProfesionalCarhue.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.profesional.practicaProfesionalCarhue.model.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}