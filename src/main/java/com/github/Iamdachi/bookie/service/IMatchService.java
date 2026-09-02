package com.github.Iamdachi.bookie.service;

import com.github.Iamdachi.bookie.entity.Match;
import com.github.Iamdachi.bookie.entity.Odd;
import com.github.Iamdachi.bookie.enums.MatchState;
import com.github.Iamdachi.bookie.model.dto.MatchDTO;
import com.github.Iamdachi.bookie.model.dto.OddDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

public interface IMatchService {
    Page<Match> filterMatches(Long sportId, Long countryId, Long leagueId, Boolean enabled, MatchState state, Date startDate, Date endDate, Pageable pageable);
    Match getMatchById(Long id);
    MatchDTO updateMatch(Long idMatch, MatchDTO matchDTO);
    void deleteMatch(Long matchId);
    MatchDTO processMatch(MatchDTO matchDTO);
    Match addOdd(OddDTO oddDTO);
    Odd updateOdd(OddDTO odd, Long id);
    List<Odd> listOdds(Long id);
    Page<Match> getMatches(Pageable pageable);
}
