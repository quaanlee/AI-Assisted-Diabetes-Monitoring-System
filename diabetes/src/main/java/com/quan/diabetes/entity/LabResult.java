package com.quan.diabetes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "LabResult")
public class LabResult {

    @Id
    @Column(name = "LabResultID", length = 50)
    private String labResultId;

    @Column(name = "Status", length = 20)
    private String status;

    @Column(name = "Flag", length = 50)
    private String flag;

    @Column(name = "ResultValue", precision = 10, scale = 2)
    private BigDecimal resultValue;

    @Column(name = "ReferenceRange", length = 50)
    private String referenceRange;

    @ManyToOne
    @JoinColumn(name = "LabOrderID")
    private LabOrder labOrder;

    @ManyToOne
    @JoinColumn(name = "LabTestID")
    private LabTestCatalog labTest;

    public LabResult() {
    }

    public String getLabResultId() {
        return labResultId;
    }

    public void setLabResultId(String labResultId) {
        this.labResultId = labResultId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public BigDecimal getResultValue() {
        return resultValue;
    }

    public void setResultValue(BigDecimal resultValue) {
        this.resultValue = resultValue;
    }

    public String getReferenceRange() {
        return referenceRange;
    }

    public void setReferenceRange(String referenceRange) {
        this.referenceRange = referenceRange;
    }

    public LabOrder getLabOrder() {
        return labOrder;
    }

    public void setLabOrder(LabOrder labOrder) {
        this.labOrder = labOrder;
    }

    public LabTestCatalog getLabTest() {
        return labTest;
    }

    public void setLabTest(LabTestCatalog labTest) {
        this.labTest = labTest;
    }
}

