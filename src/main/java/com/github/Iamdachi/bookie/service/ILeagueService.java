package com.github.Iamdachi.bookie.service;

import com.github.Iamdachi.bookie.entity.League;

import java.util.List;
import java.util.Optional;

public interface ILeagueService {
    League save(League league);
    League update(League league, Long id);
    void delete(Long league);
    List<League> findAll();
    Optional<League> findById(Long id);
}
