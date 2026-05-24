package com.quan.diabetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quan.diabetes.entity.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, String> {
}

