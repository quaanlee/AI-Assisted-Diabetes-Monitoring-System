package com.quan.diabetes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AI_Assistant")
public class AIAssistant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AIAssistantID")
    private int aiAssistantId;

    @Column(name = "AIName", unique = true, length = 100, columnDefinition = "NVARCHAR(100)")
    private String aiName;

    @Column(name = "Status", length = 50, columnDefinition = "NVARCHAR(50)")
    private String status;

    @Column(name = "ModelName", length = 50)
    private String modelName;

    public AIAssistant() {
    }

    public int getAiAssistantId() {
        return aiAssistantId;
    }

    public void setAiAssistantId(int aiAssistantId) {
        this.aiAssistantId = aiAssistantId;
    }

    public String getAiName() {
        return aiName;
    }

    public void setAiName(String aiName) {
        this.aiName = aiName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}



