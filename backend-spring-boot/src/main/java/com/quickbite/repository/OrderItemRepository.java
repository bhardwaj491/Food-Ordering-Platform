package com.quickbite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickbite.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
