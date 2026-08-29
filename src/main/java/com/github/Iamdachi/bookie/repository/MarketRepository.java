package com.github.Iamdachi.bookie.repository;

import com.github.Iamdachi.bookie.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MarketRepository extends JpaRepository<Market, Long> {
    Optional<Market> findByName(String name);
}
