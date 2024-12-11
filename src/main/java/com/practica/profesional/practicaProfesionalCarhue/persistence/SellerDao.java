package com.practica.profesional.practicaProfesionalCarhue.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.profesional.practicaProfesionalCarhue.model.Seller;

public interface SellerDao extends JpaRepository<Seller, Integer> {
	
	Optional<Seller> findByMobile(String mobile);
	
}