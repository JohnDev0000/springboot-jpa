package com.johnweb.course.repositories;

import com.johnweb.course.entities.Order;
import com.johnweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
