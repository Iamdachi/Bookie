package com.github.Iamdachi.bookie.repository;

import com.github.Iamdachi.bookie.entity.Ticket;
import com.github.Iamdachi.bookie.enums.TicketStatusInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Page<Ticket> findAllByUserId(Long userId, Pageable pageable);

    Page<Ticket> findAllByUserIdAndTicketStatusInfo(Long userId, TicketStatusInfo ticketStatusInfo, Pageable pageable);
}
