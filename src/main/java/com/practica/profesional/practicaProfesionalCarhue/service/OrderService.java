package com.practica.profesional.practicaProfesionalCarhue.service;

import java.time.LocalDate;
import java.util.List;

import com.practica.profesional.practicaProfesionalCarhue.exception.CustomerNotFoundException;
import com.practica.profesional.practicaProfesionalCarhue.exception.LoginException;
import com.practica.profesional.practicaProfesionalCarhue.exception.OrderException;
import com.practica.profesional.practicaProfesionalCarhue.models.Customer;
import com.practica.profesional.practicaProfesionalCarhue.models.Order;
import com.practica.profesional.practicaProfesionalCarhue.models.OrderDTO;

public interface OrderService {
	public Order saveOrder(OrderDTO odto,String token) throws LoginException, OrderException;
	
	public Order getOrderByOrderId(Integer OrderId) throws OrderException;
	
	public List<Order> getAllOrders() throws OrderException;
	
	public Order cancelOrderByOrderId(Integer OrderId,String token) throws OrderException;
	
	public Order updateOrderByOrder(OrderDTO order,Integer OrderId,String token) throws OrderException,LoginException;
	
	public List<Order> getAllOrdersByDate(LocalDate date) throws OrderException;

	public Customer getCustomerByOrderid(Integer orderId) throws OrderException;
	
	//public Customer getCustomerIdByToken(String token) throws CustomerNotFoundException;
}
