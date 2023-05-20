package com.petrocini.ordercontrol.repositories;

import com.petrocini.ordercontrol.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
