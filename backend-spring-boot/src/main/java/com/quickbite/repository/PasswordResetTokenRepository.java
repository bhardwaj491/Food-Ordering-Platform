package com.quickbite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickbite.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
