package com.johnweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
