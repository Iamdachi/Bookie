package com.github.Iamdachi.bookie.entity;

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
public class League extends BaseEntity {
    // TODO: need column here? like FK?
    private Long sportId;

    private Long countryId;

    public League () {
    }

    public League(Long id, LocalDateTime createdAt, LocalDateTime updatedAt, String name, Long sportId, Long countryId) {
        super(id, createdAt, updatedAt, name);
        this.sportId = sportId;
        this.countryId = countryId;
    }

    public League(String name, Long sportId, Long countryId) {
        super(name);
        this.sportId = sportId;
        this.countryId = countryId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        League league = (League) o;
        return Objects.equals(sportId, league.sportId) && Objects.equals(countryId, league.countryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sportId, countryId);
    }
}
