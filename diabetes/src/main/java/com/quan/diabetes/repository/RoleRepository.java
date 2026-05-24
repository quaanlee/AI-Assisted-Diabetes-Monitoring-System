package com.quan.diabetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quan.diabetes.entity.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
}

