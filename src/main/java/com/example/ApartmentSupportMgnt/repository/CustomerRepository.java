package com.example.ApartmentSupportMgnt.repository;

import com.example.ApartmentSupportMgnt.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
