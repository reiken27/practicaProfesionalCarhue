package com.practica.profesional.practicaProfesionalCarhue.service;

import java.util.List;

import com.practica.profesional.practicaProfesionalCarhue.exception.SellerException;
import com.practica.profesional.practicaProfesionalCarhue.models.Seller;
import com.practica.profesional.practicaProfesionalCarhue.models.SellerDTO;
import com.practica.profesional.practicaProfesionalCarhue.models.SessionDTO;

public interface SellerService {
	
	public Seller addSeller(Seller seller);
	
	public List<Seller> getAllSellers() throws SellerException;
	
	public Seller getSellerById(Integer sellerId)throws SellerException;
	
	public Seller getSellerByMobile(String mobile, String token) throws SellerException;
	
	public Seller getCurrentlyLoggedInSeller(String token) throws SellerException;
	
	public SessionDTO updateSellerPassword(SellerDTO sellerDTO, String token) throws SellerException;
	
	public Seller updateSeller(Seller seller, String token)throws SellerException;
	
	public Seller updateSellerMobile(SellerDTO sellerdto, String token)throws SellerException;
	
	public Seller deleteSellerById(Integer sellerId, String token)throws SellerException;

}
