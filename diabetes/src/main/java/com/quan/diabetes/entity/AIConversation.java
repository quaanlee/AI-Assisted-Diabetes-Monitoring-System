package com.quan.diabetes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "AI_Conversation")
public class AIConversation {

    @Id
    @Column(name = "AIConversationID", length = 50)
    private String aiConversationId;

    @Column(name = "CreatedAt")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "PatientID")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "AIAssistantID")
    private AIAssistant aiAssistant;

    @Column(name = "Topic", length = 150, columnDefinition = "NVARCHAR(150)")
    private String topic;

    public AIConversation() {
    }

    public String getAiConversationId() {
        return aiConversationId;
    }

    public void setAiConversationId(String aiConversationId) {
        this.aiConversationId = aiConversationId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public AIAssistant getAiAssistant() {
        return aiAssistant;
    }

    public void setAiAssistant(AIAssistant aiAssistant) {
        this.aiAssistant = aiAssistant;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}


