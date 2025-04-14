package com.quickbite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickbite.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
