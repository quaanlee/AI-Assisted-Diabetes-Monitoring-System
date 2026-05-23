package com.quan.diabetes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "AI_Message")
public class AIMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AIMessageID")
    private long aiMessageId;

    @Column(name = "Content", columnDefinition = "NVARCHAR(MAX)")
    private String content;

    @Column(name = "Sender", length = 10)
    private String sender;

    @Column(name = "Time")
    private LocalDateTime time;

    @ManyToOne
    @JoinColumn(name = "AIConversationID")
    private AIConversation aiConversation;

    public AIMessage() {
    }

    public long getAiMessageId() {
        return aiMessageId;
    }

    public void setAiMessageId(long aiMessageId) {
        this.aiMessageId = aiMessageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public AIConversation getAiConversation() {
        return aiConversation;
    }

    public void setAiConversation(AIConversation aiConversation) {
        this.aiConversation = aiConversation;
    }
}



