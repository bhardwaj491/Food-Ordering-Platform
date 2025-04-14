package com.quickbite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickbite.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
