package com.github.Iamdachi.bookie.entity;

import com.github.Iamdachi.bookie.enums.TicketStatus;
import com.github.Iamdachi.bookie.enums.TicketStatusInfo;
import com.github.Iamdachi.bookie.enums.TicketType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tickets")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TicketType ticketType;

    @Enumerated(EnumType.STRING)
    private TicketStatusInfo ticketStatusInfo;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

    private Double betAmount;

    private Double value;

    private Long userId;

    private Double payoutAmount;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
    private List<TicketOdd> ticketOdds;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}
