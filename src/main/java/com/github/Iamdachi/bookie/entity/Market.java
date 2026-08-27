package com.github.Iamdachi.bookie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Market extends BaseEntity {
    public Market() {}

    public Market(String name) {
        // TODO: is name enough ?
        super(name);
    }
}
