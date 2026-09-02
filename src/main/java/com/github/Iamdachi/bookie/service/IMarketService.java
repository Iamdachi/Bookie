package com.github.Iamdachi.bookie.service;

import com.github.Iamdachi.bookie.entity.Market;
import com.github.Iamdachi.bookie.entity.Odd;
import com.github.Iamdachi.bookie.model.dto.MarketDto;

import java.util.List;

public interface IMarketService {
    Market save(MarketDto market);
    Market update(Long id, MarketDto market);
    Market findById(Long id);
    List<Market> findAll();
    void delete(Long id);
    List<Odd> processMarket(Long match, List<MarketDto> marketDtoList);
}
