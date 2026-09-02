package com.github.Iamdachi.bookie.service.impl;

import com.github.Iamdachi.bookie.entity.League;
import com.github.Iamdachi.bookie.repository.LeagueRepository;
import com.github.Iamdachi.bookie.service.ILeagueService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeagueServiceImpl implements ILeagueService {
    private final LeagueRepository leagueRepository;

    public LeagueServiceImpl(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    @Override
    public League save(League league) {
        return leagueRepository.save(league);
    }

    @Override
    public League update(League league, Long id) {
        League updatedLeague = leagueRepository.findById(id).orElseThrow(() -> new RuntimeException(("League not found")));
        updatedLeague.setName(league.getName());
        updatedLeague.setCountryId(league.getCountryId());
        updatedLeague.setSportId(league.getSportId());
        updatedLeague.setName(league.getName());
        return leagueRepository.save(updatedLeague);
    }

    @Override
    public void delete(Long league) {
        League league1 = leagueRepository.findById(league).orElseThrow(() -> new RuntimeException(("League not found")));
        leagueRepository.delete(league1);
    }

    @Override
    public List<League> findAll() {
        return leagueRepository.findAll();
    }

    @Override
    public Optional<League> findById(Long id) {
        return leagueRepository.findById(id);
    }
}
