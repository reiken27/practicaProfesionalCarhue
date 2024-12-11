package com.practica.profesional.practicaProfesionalCarhue.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practica.profesional.practicaProfesionalCarhue.models.Customer;
import com.practica.profesional.practicaProfesionalCarhue.models.CustomerDTO;
import com.practica.profesional.practicaProfesionalCarhue.models.Seller;
import com.practica.profesional.practicaProfesionalCarhue.models.SellerDTO;
import com.practica.profesional.practicaProfesionalCarhue.models.SessionDTO;
import com.practica.profesional.practicaProfesionalCarhue.models.UserSession;
import com.practica.profesional.practicaProfesionalCarhue.service.CustomerService;
import com.practica.profesional.practicaProfesionalCarhue.service.LoginLogoutService;
import com.practica.profesional.practicaProfesionalCarhue.service.SellerService;

@RestController
public class LoginController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private LoginLogoutService loginService;
	
	@Autowired
	private SellerService sellerService;

	
	// Handler para regiustrar un nuevo cliente
	
	@PostMapping(value = "/register/customer", consumes = "application/json")
	public ResponseEntity<Customer> registerAccountHandler(@Valid @RequestBody Customer customer) {
		return new ResponseEntity<>(customerService.addCustomer(customer), HttpStatus.CREATED);
	}
	
	// Handler para logear usuario
	
	@PostMapping(value = "/login/customer", consumes = "application/json")
	public ResponseEntity<UserSession> loginCustomerHandler(@Valid @RequestBody CustomerDTO customerdto){
		return new ResponseEntity<>(loginService.loginCustomer(customerdto), HttpStatus.ACCEPTED);
	}
	
	
	// Handler para logout un usuario
	
	@PostMapping(value = "/logout/customer", consumes = "application/json")
	public ResponseEntity<SessionDTO> logoutCustomerHandler(@RequestBody SessionDTO sessionToken){
		return new ResponseEntity<>(loginService.logoutCustomer(sessionToken), HttpStatus.ACCEPTED);
	}
	
	
	
	
	/*********** SELLER REGISTER LOGIN LOGOUT HANDLER ************/
	
	@PostMapping(value = "/register/seller", consumes = "application/json")
	public ResponseEntity<Seller> registerSellerAccountHandler(@Valid @RequestBody Seller seller) {
		return new ResponseEntity<>(sellerService.addSeller(seller), HttpStatus.CREATED);
	}
	
	
	// Handler para logear un usuario
	
	@PostMapping(value = "/login/seller", consumes = "application/json")
	public ResponseEntity<UserSession> loginSellerHandler(@Valid @RequestBody SellerDTO seller){
		return new ResponseEntity<>(loginService.loginSeller(seller), HttpStatus.ACCEPTED);
	}
		
		
	// Handler para logout un usuario
		
	@PostMapping(value = "/logout/seller", consumes = "application/json")
	public ResponseEntity<SessionDTO> logoutSellerHandler(@RequestBody SessionDTO sessionToken){
		return new ResponseEntity<>(loginService.logoutSeller(sessionToken), HttpStatus.ACCEPTED);
	}
	
}