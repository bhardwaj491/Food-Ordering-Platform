package com.quickbite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickbite.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
