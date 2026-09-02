package com.github.Iamdachi.bookie.service;

import com.github.Iamdachi.bookie.entity.Odd;
import com.github.Iamdachi.bookie.model.dto.OddDTO;

import java.util.List;
import java.util.Optional;


public interface IOddService {
    Odd saveOdd(Odd odd);
    List<Odd> getOdds();
    Optional<Odd> findById(Long id);
    Odd updateOdd(Odd odd);
    void deleteOdd(Long id);
    List<Odd> processOdds(List<OddDTO> oddDTOs, Long matchId, Long marketId);
    List<Odd> saveAll(List<Odd> allOdds);
}
