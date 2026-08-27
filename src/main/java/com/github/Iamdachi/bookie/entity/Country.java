package com.github.Iamdachi.bookie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table
@Getter
@Setter
public class Country extends BaseEntity{
    @Column(name = "sport_id")
    private Long sportId;

    public Country() {
    }

    public Country(LocalDateTime createdAt, LocalDateTime updatedAt, String name, Long sportId) {
        super(createdAt, updatedAt, name);
        this.sportId = sportId;
    }

    @Override
    public boolean equals(Object o){
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (!super.equals(o)) {
            return false;
        }

        Country country = (Country) o;
        return Objects.equals(sportId, country.sportId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sportId);
    }
}
