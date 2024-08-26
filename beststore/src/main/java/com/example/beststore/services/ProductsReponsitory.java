package com.example.beststore.services;

import com.example.beststore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsReponsitory extends JpaRepository<Product, Integer> {

}
