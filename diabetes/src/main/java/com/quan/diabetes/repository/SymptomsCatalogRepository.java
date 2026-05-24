package com.quan.diabetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quan.diabetes.entity.SymptomsCatalog;

public interface SymptomsCatalogRepository extends JpaRepository<SymptomsCatalog, String> {
}

