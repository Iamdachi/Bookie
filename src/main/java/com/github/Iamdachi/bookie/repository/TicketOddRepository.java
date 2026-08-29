package com.github.Iamdachi.bookie.repository;

import com.github.Iamdachi.bookie.entity.Odd;
import com.github.Iamdachi.bookie.entity.TicketOdd;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketOddRepository extends JpaRepository<TicketOdd, Long> {
    List<TicketOdd> findByOdd(Odd odd);
}
