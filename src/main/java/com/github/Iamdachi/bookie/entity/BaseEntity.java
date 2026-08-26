package com.github.Iamdachi.bookie.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
@NoArgsConstructor
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    private String name;

    protected BaseEntity(String name) {
        this.name = name;
    }

    protected BaseEntity(Long id, LocalDateTime createdAt, LocalDateTime updatedAt, String name) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.name = name;
    }

    protected BaseEntity(LocalDateTime createdAt, LocalDateTime updatedAt, String name) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.name = name;
    }
}
