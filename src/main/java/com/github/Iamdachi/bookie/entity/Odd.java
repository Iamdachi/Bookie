package com.github.Iamdachi.bookie.entity;

import com.github.Iamdachi.bookie.enums.OddStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "odds")
@Getter
@Setter
public class Odd extends BaseEntity {
    @Column(name = "match_id", nullable = false)
    private Long match;

    @Column(name = "market_id")
    private Long marketId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OddStatus status;

    @Column(name = "value_odd", nullable = false)
    private Double value;

    public Odd () {}

    public Odd(Long marketId, Long match, OddStatus status, Double value) {
        this.marketId = marketId;
        this.match = match;
        this.status = status;
        this.value = value;
    }

    public Odd(String name, Long marketId, Long match, OddStatus status, Double value) {
        super(name);
        this.marketId = marketId;
        this.match = match;
        this.status = status;
        this.value = value;
    }

    @Override
    public boolean equals (Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (!super.equals(o)) {
            return false;
        }

        Odd odd = (Odd) o;
        return Objects.equals(match, odd.match) && status == odd.status && Objects.equals(value, odd.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), match, status, value);
    }
}
