package com.github.Iamdachi.bookie.entity;


import com.github.Iamdachi.bookie.enums.OddStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketOdd {

    @EmbeddedId
    private TicketOddId id;

    @MapsId("ticketId")
    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    @MapsId("oddId")
    @ManyToOne
    @JoinColumn(name = "odd_id")
    private Odd odd;

    private Double originalOddValue;

    private Long matchId;

    @Enumerated(EnumType.STRING)
    private OddStatus oddStatus;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

}
