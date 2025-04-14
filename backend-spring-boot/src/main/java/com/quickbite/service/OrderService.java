package com.quickbite.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.quickbite.Exception.CartException;
import com.quickbite.Exception.OrderException;
import com.quickbite.Exception.RestaurantException;
import com.quickbite.Exception.UserException;
import com.quickbite.model.Order;
import com.quickbite.model.PaymentResponse;
import com.quickbite.model.User;
import com.quickbite.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
