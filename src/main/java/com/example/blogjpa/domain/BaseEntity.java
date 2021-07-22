package com.example.blogjpa.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    @CreatedDate
    @Column(name = "insert_time", columnDefinition = "DATETIME", nullable = false)
    private LocalDateTime insertTime;

    @LastModifiedDate
    @Column(name = "update_time", columnDefinition = "DATETIME")
    private LocalDateTime updateTime;

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }
}
