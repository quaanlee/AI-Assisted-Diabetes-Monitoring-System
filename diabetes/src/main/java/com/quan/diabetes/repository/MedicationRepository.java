package com.quan.diabetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quan.diabetes.entity.Medication;

public interface MedicationRepository extends JpaRepository<Medication, String> {
}

