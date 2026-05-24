package com.quan.diabetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quan.diabetes.entity.LabOrder;

public interface LabOrderRepository extends JpaRepository<LabOrder, String> {
}

