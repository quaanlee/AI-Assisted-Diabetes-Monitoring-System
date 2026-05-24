package com.quan.diabetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quan.diabetes.entity.ClinicalExamination;

public interface ClinicalExaminationRepository extends JpaRepository<ClinicalExamination, String> {
}

