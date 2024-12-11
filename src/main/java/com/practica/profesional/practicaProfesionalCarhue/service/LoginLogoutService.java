package com.practica.profesional.practicaProfesionalCarhue.service;

import com.practica.profesional.practicaProfesionalCarhue.models.CustomerDTO;
import com.practica.profesional.practicaProfesionalCarhue.models.SellerDTO;
import com.practica.profesional.practicaProfesionalCarhue.models.SessionDTO;
import com.practica.profesional.practicaProfesionalCarhue.models.UserSession;

public interface LoginLogoutService {
	
	public UserSession loginCustomer(CustomerDTO customer);
	
	public SessionDTO logoutCustomer(SessionDTO session);
	
	public void checkTokenStatus(String token);
	
	public void deleteExpiredTokens();
	
	public UserSession loginSeller(SellerDTO seller);
	
	public SessionDTO logoutSeller(SessionDTO session);
	
}
