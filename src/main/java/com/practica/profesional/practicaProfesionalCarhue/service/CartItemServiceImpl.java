package com.practica.profesional.practicaProfesionalCarhue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.profesional.practicaProfesionalCarhue.exception.ProductNotFoundException;
import com.practica.profesional.practicaProfesionalCarhue.models.CartDTO;
import com.practica.profesional.practicaProfesionalCarhue.models.CartItem;
import com.practica.profesional.practicaProfesionalCarhue.models.Product;
import com.practica.profesional.practicaProfesionalCarhue.models.ProductStatus;
import com.practica.profesional.practicaProfesionalCarhue.repository.ProductDao;

@Service
public class CartItemServiceImpl implements CartItemService{

	@Autowired
	ProductDao productDao;

	@Override
	public CartItem createItemforCart(CartDTO cartdto) {
		
		Product existingProduct = productDao.findById(cartdto.getProductId()).orElseThrow( () -> new ProductNotFoundException("Product Not found"));
		
		if(existingProduct.getStatus().equals(ProductStatus.OUTOFSTOCK) || existingProduct.getQuantity() == 0) {
			throw new ProductNotFoundException("Product OUT OF STOCK");
		}
		
		CartItem newItem = new CartItem();
		
		newItem.setCartItemQuantity(1);
		
		newItem.setCartProduct(existingProduct);
		
		return newItem;
	}
	
//	@Override
//	public CartItem addItemToCart(CartDTO cartdto) {
//		
//		// TODO Auto-generated method stub
//		
////		Product existingProduct = productDao.findById(cartdto.getProductId()).orElseThrow( () -> new ProductException("Product Not found"));
//		
//		Optional<Product> opt = productDao.findById(cartdto.getProductId());
//		
//		if(opt.isEmpty())
//			throw new ProductNotFoundException("Product not found");
//		
//		Product existingProduct = opt.get();
//		
//		CartItem newItem = new CartItem();
//		
//		newItem.setCartProduct(existingProduct);
//		
//		newItem.setCartItemQuantity(1);
//		
//		return newItem;
//	}

}
