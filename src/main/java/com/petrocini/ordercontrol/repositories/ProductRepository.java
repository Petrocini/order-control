package com.petrocini.ordercontrol.repositories;

import com.petrocini.ordercontrol.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
