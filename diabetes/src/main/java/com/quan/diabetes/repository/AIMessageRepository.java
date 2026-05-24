package com.quan.diabetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quan.diabetes.entity.AIMessage;

public interface AIMessageRepository extends JpaRepository<AIMessage, Long> {
}

