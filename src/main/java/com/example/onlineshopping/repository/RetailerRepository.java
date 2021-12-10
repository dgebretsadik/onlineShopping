package com.example.onlineshopping.repository;

import com.example.onlineshopping.domain.Retailer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RetailerRepository extends JpaRepository<Retailer, Long> {
}
