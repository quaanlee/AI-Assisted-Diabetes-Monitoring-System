package com.quan.diabetes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LabOrder")
public class LabOrder {

    @Id
    @Column(name = "LabOrderID", length = 50)
    private String labOrderId;

    @Column(name = "Status", length = 20)
    private String status;

    @ManyToOne
    @JoinColumn(name = "ClinicalExamID")
    private ClinicalExamination clinicalExamination;

    public LabOrder() {
    }

    public String getLabOrderId() {
        return labOrderId;
    }

    public void setLabOrderId(String labOrderId) {
        this.labOrderId = labOrderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClinicalExamination getClinicalExamination() {
        return clinicalExamination;
    }

    public void setClinicalExamination(ClinicalExamination clinicalExamination) {
        this.clinicalExamination = clinicalExamination;
    }
}

