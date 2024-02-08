package com.johnweb.course.repositories;

import com.johnweb.course.entities.Category;
import com.johnweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
