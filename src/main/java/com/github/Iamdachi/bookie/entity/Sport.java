package com.github.Iamdachi.bookie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
public class Sport extends BaseEntity {
    public Sport() { }

    public Sport(Long id, LocalDateTime createdAt, LocalDateTime updatedAt, String name) {
        super(id, createdAt, updatedAt, name);
    }
}
