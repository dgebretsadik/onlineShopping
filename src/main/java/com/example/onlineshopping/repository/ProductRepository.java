package com.example.onlineshopping.repository;

import com.example.onlineshopping.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
