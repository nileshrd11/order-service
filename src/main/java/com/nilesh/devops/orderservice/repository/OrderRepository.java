package com.nilesh.devops.orderservice.repository;

import com.nilesh.devops.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
