package com.quan.diabetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quan.diabetes.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    // add custom query methods if needed
}

