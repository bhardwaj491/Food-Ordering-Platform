package com.quickbite.service;

import com.quickbite.Exception.CartException;
import com.quickbite.Exception.CartItemException;
import com.quickbite.Exception.FoodException;
import com.quickbite.Exception.UserException;
import com.quickbite.model.Cart;
import com.quickbite.model.CartItem;
import com.quickbite.request.AddCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
