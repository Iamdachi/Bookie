package com.github.Iamdachi.bookie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Embeddable
@Setter
@Getter
public class TicketOddId {

    @Column(name = "ticket_id")
    private Long ticketId;

    @Column(name = "odd_id")
    private Long oddId;

    public TicketOddId(Long ticketId, Long oddId) {
        this.ticketId = ticketId;
        this.oddId = oddId;
    }

    public TicketOddId () {}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TicketOddId that = (TicketOddId) o;
        return Objects.equals(ticketId, that.ticketId) && Objects.equals(oddId, that.oddId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId, oddId);
    }
}
