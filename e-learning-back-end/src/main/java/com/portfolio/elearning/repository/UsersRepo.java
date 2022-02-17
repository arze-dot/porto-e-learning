package com.portfolio.elearning.repository;

import com.portfolio.elearning.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);
}
