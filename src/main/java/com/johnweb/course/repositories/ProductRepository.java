package com.johnweb.course.repositories;

import com.johnweb.course.entities.Category;
import com.johnweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
