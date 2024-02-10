package com.johnweb.course.repositories;

import com.johnweb.course.entities.Order;
import com.johnweb.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
