package com.quickbite.service;

import java.util.List;

import com.quickbite.model.Notification;
import com.quickbite.model.Order;
import com.quickbite.model.Restaurant;
import com.quickbite.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
