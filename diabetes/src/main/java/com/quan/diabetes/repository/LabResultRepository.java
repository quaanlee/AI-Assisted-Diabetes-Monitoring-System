package com.quan.diabetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quan.diabetes.entity.LabResult;

public interface LabResultRepository extends JpaRepository<LabResult, String> {
}

