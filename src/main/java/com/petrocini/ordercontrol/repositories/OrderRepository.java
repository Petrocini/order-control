package com.petrocini.ordercontrol.repositories;

import com.petrocini.ordercontrol.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
