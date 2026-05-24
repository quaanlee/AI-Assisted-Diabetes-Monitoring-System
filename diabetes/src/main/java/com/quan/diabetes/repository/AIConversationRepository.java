package com.quan.diabetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quan.diabetes.entity.AIConversation;

public interface AIConversationRepository extends JpaRepository<AIConversation, String> {
}

