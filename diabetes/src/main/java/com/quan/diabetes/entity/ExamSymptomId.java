package com.quan.diabetes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ExamSymptomId implements Serializable {

    @Column(name = "ClinicalExamID", length = 50)
    private String clinicalExamId;

    @Column(name = "SymptomID", length = 50)
    private String symptomId;

    public ExamSymptomId() {
    }

    public ExamSymptomId(String clinicalExamId, String symptomId) {
        this.clinicalExamId = clinicalExamId;
        this.symptomId = symptomId;
    }

    public String getClinicalExamId() {
        return clinicalExamId;
    }

    public void setClinicalExamId(String clinicalExamId) {
        this.clinicalExamId = clinicalExamId;
    }

    public String getSymptomId() {
        return symptomId;
    }

    public void setSymptomId(String symptomId) {
        this.symptomId = symptomId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamSymptomId that = (ExamSymptomId) o;
        return Objects.equals(clinicalExamId, that.clinicalExamId) && Objects.equals(symptomId, that.symptomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clinicalExamId, symptomId);
    }
}

