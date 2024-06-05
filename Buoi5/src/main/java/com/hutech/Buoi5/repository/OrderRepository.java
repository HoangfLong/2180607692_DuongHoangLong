package com.hutech.Buoi5.repository;

import com.hutech.Buoi5.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
