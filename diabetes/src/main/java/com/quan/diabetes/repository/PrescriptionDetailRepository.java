package com.quan.diabetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quan.diabetes.entity.PrescriptionDetail;

public interface PrescriptionDetailRepository extends JpaRepository<PrescriptionDetail, String> {
}

